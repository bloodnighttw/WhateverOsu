package io.github.bloodnighttw.whateverOsu.extra.ppaddict

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class PPAddictTest {

	private lateinit var retrofit: Retrofit
	private lateinit var ppaddictService: BeatmapinfoService

	@BeforeEach
	fun setup() {
		val gson = GsonBuilder()
			//.registerTypeAdapterFactory(typeAdapter2)
			.create()

		retrofit = Retrofit.Builder()
			.baseUrl("https://api.tillerino.org")
			.addConverterFactory(GsonConverterFactory.create(gson))
			.client(OkHttpClient())
			.build()

		ppaddictService = retrofit.create(BeatmapinfoService::class.java)
	}

	@Test
	fun getBeatmapInfo() {
		val c = ppaddictService.getBeatmapInfo("eeb9db9d4e684326bbd316067fb384b8", 602259).execute().body()
		println(c)
	}

}
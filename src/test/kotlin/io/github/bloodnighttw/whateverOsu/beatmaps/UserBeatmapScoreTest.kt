package io.github.bloodnighttw.whateverOsu.beatmaps

import com.google.gson.GsonBuilder
import io.github.bloodnighttw.whateverOsu.authorize.Authorize
import io.github.bloodnighttw.whateverOsu.authorize.AuthorizeService
import io.github.bloodnighttw.whateverOsu.authorize.Token
import okhttp3.OkHttpClient
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class UserBeatmapScoreTest{

	private lateinit var instance: Token
	private lateinit var retrofit: Retrofit
	private lateinit var beatmapService:BeatmapService

	@BeforeEach
	fun getToken(){

		val gson = GsonBuilder()
			//.registerTypeAdapterFactory(typeAdapter2)
			.create()



		retrofit = Retrofit.Builder()
			.baseUrl("https://osu.ppy.sh/")
			.addConverterFactory(GsonConverterFactory.create(gson))
			.client(OkHttpClient())
			.build()

		val authorizeService = retrofit.create(AuthorizeService::class.java)

		instance = authorizeService.getToken(Authorize(System.getenv("CLIENT_ID")?:"",System.getenv("CS")?:""))
			.execute().body()!!
		beatmapService = retrofit.create(BeatmapService::class.java)

	}

	@Test
	fun getBeatmapsUserScore(){

		val c = beatmapService.getBeatmapsUserScore(instance.accessToken,1675834,21011574).execute().body()
		println(c)

	}

	@Test
	fun getBeatmapsScores(){
		val c = beatmapService.getBeatmapsScores(instance.accessToken,1675834).execute().body()
		println(c)
	}

	@Test
	fun getBeatmap(){
		val c = beatmapService.getBeatmapInfo(instance.accessToken,1675834).execute().body()
		if(c is Beatmap){
			println(c)
		}
	}

	@Test
	fun getBeatmaps(){
		val c = beatmapService.getBeatmaps(instance.accessToken, ids = "1675832").execute().body()
		println(c)
	}

}
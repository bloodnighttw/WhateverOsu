package io.github.bloodnighttw.whateverOsu.authorize

import okhttp3.OkHttpClient
import org.junit.jupiter.api.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


internal class TokenTest{
	@Test
	fun tokenTest(){
		val retrofit = Retrofit.Builder()
			.baseUrl("https://osu.ppy.sh/")
			.addConverterFactory(GsonConverterFactory.create())
			.client(OkHttpClient())
			.build()

		val authorizeService = retrofit.create(AuthorizeService::class.java)
		println(System.getenv("CS"))
		println(System.getenv("CLIENT_ID"))

		authorizeService.getToken(Authorize(System.getenv("CLIENT_ID")?:"",System.getenv("CS")?:""))
			.execute().body()?.let { println(it) }
	}
}

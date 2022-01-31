package io.github.bloodnighttw.whateverOsu.user

import com.google.gson.GsonBuilder
import io.github.bloodnighttw.whateverOsu.authorize.Authorize
import io.github.bloodnighttw.whateverOsu.authorize.AuthorizeService
import io.github.bloodnighttw.whateverOsu.authorize.Token
import io.github.bloodnighttw.whateverOsu.utils.ScoreType
import okhttp3.OkHttpClient
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class UserServiceTest {
	private lateinit var instance: Token
	private lateinit var retrofit: Retrofit
	private lateinit var userService: UserService

	@BeforeEach
	fun getToken() {

		val gson = GsonBuilder()
			//.registerTypeAdapterFactory(typeAdapter2)
			.create()



		retrofit = Retrofit.Builder()
			.baseUrl("https://osu.ppy.sh/")
			.addConverterFactory(GsonConverterFactory.create(gson))
			.client(OkHttpClient())
			.build()

		val authorizeService = retrofit.create(AuthorizeService::class.java)

		instance = authorizeService.getToken(Authorize(System.getenv("CLIENT_ID") ?: "", System.getenv("CS") ?: ""))
			.execute().body()!!

		userService = retrofit.create(UserService::class.java)

	}

	@Test
	fun getUserTest() {
		val c = userService.getUser(instance.accessToken, 4504101).execute().body()
		println(c)
	}

	@Test
	fun getUserScoreTest() {
		var c = userService.getUserScores(instance.accessToken, 21011574, ScoreType.Recent).execute().body()
		println("[")
		c?.forEach { println(it) }
		println("]")

		c = userService.getUserScores(instance.accessToken, 21011574, ScoreType.Best).execute().body()
		println("[")
		c?.forEach { println(it) }
		println("]")

		c = userService.getUserScores(instance.accessToken, 4504101, ScoreType.Best).execute().body()
		println("[")
		c?.forEach { println(it) }
		println("]")
	}

	@Test
	fun getUser() {
		val c = userService.getUser(instance.accessToken, 4504101).execute().body()
		println(c)
	}


}
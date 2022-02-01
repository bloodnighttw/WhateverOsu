package io.github.bloodnighttw.whateverOsu.user

import io.github.bloodnighttw.whateverOsu.utils.OsuMode
import io.github.bloodnighttw.whateverOsu.utils.Score
import io.github.bloodnighttw.whateverOsu.utils.ScoreType
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {

	@GET("/api/v2/users/{user}")
	fun getUser(
		@Header("Authorization") accessToken: String,
		@Path("user") user: Long,
		@Query("key") key: String? = null
	): Call<User>

	@GET("/api/v2/users/{user}/{mode}")
	fun getUser(
		@Header("Authorization") accessToken: String,
		@Path("user") user: String,
		@Path("mode") mode: OsuMode,
		@Query("key") key: String? = null
	): Call<User>

	@GET("/api/v2/users/{user}/scores/{type}")
	fun getUserScores(
		@Header("Authorization") accessToken: String,
		@Path("user") user: String,
		@Path("type") type: ScoreType,
		@Query("include_fails") includeFails: Int = 0,
		@Query("mode") mode: OsuMode? = null,
		@Query("limit") limit: Int? = null,
		@Query("offset") offset: String? = null
	): Call<Array<Score>>

}
package io.github.bloodnighttw.whateverOsu

import io.github.bloodnighttw.whateverOsu.authorize.AuthorizeService
import io.github.bloodnighttw.whateverOsu.beatmaps.BeatmapService
import io.github.bloodnighttw.whateverOsu.user.UserService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit: Retrofit = Builder()
	.baseUrl("https://osu.ppy.sh/")
	.addConverterFactory(GsonConverterFactory.create())
	.client(OkHttpClient())
	.build()

val authorizeService: AuthorizeService = retrofit.create(AuthorizeService::class.java)
val userService: UserService = retrofit.create(UserService::class.java)
val beatmapService: BeatmapService = retrofit.create(BeatmapService::class.java)


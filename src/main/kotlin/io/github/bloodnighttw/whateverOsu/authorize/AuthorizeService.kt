package io.github.bloodnighttw.whateverOsu.authorize

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthorizeService {
	@POST("/oauth/token")
	fun getToken(@Body authorize:Authorize): Call<Token>
}
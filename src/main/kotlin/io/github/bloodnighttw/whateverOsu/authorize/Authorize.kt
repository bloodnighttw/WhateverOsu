package io.github.bloodnighttw.whateverOsu.authorize

import com.google.gson.annotations.SerializedName

data class Authorize(
	@SerializedName("client_id") val clientID:String,
	@SerializedName("client_secret") val clientSecret:String,
	@SerializedName("grant_type") val grantType: String = "client_credentials",
	@SerializedName("scope") val redirectUrl:String = "public"
)
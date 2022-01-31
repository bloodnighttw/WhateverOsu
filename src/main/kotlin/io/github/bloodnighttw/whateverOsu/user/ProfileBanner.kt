package io.github.bloodnighttw.whateverOsu.user

import com.google.gson.annotations.SerializedName

data class ProfileBanner(
	val id: Long,
	@SerializedName("tournament_id") val tournamentId: Long,
	val image: String
)

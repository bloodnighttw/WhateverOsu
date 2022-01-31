package io.github.bloodnighttw.whateverOsu.user

import com.google.gson.annotations.SerializedName
import java.util.*

data class UserBadge(
	@SerializedName("awarded_at") val awardedAt: Date,
	val description: String,
	@SerializedName("image_url") val imageUrl: String,
	val url: String
)

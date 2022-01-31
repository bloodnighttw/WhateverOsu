package io.github.bloodnighttw.whateverOsu.user

import com.google.gson.annotations.SerializedName
import java.util.*

data class Achievement(
	@SerializedName("achieved_at") val achievedAt: Date,
	@SerializedName("achievement_id") val id: Long
)
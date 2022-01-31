package io.github.bloodnighttw.whateverOsu.user

import com.google.gson.annotations.SerializedName

data class DateAndCount(
	@SerializedName("start_date") val startDate: String,
	val count: Long
)
package io.github.bloodnighttw.whateverOsu.utils

import com.google.gson.annotations.SerializedName

data class Availability(
	@SerializedName("download_disabled") 	val downloadDisabled:Boolean,
	@SerializedName("more_information") 	val moreInformation:String?
)

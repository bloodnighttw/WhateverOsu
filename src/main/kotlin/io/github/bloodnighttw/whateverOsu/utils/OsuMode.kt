package io.github.bloodnighttw.whateverOsu.utils

import com.google.gson.annotations.SerializedName

enum class OsuMode(private val s: String) {
	@SerializedName("osu")
	OSU("osu"),

	@SerializedName("mania")
	Mania("mania"),

	@SerializedName("taiko")
	Taiko("taiko"),

	@SerializedName("fruits")
	Catch("fruits");

	override fun toString(): String {
		return s
	}

}
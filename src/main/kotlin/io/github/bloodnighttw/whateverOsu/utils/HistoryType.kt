package io.github.bloodnighttw.whateverOsu.utils

import com.google.gson.annotations.SerializedName

enum class HistoryType(private val s: String) {
	@SerializedName("note")
	NOTE("note"),

	@SerializedName("restriction")
	RESTRICTION("restriction"),

	@SerializedName("silence")
	SILENCE("silence");

	override fun toString(): String {
		return s
	}

}
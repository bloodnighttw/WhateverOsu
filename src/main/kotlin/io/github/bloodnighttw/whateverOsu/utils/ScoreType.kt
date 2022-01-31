package io.github.bloodnighttw.whateverOsu.utils

enum class ScoreType(val s: String) {

	Best("best"),
	First("firsts"),
	Recent("recent");

	override fun toString(): String {
		return s
	}


}
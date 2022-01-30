package io.github.bloodnighttw.whateverOsu.beatmaps

import io.github.bloodnighttw.whateverOsu.utils.Score

data class BeatmapScores(
	val scores: Array<Score>,
	val userScore: BeatmapUserScore?
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as BeatmapScores

		if (!scores.contentEquals(other.scores)) return false
		if (userScore != other.userScore) return false

		return true
	}

	override fun hashCode(): Int {
		var result = scores.contentHashCode()
		result = 31 * result + (userScore?.hashCode() ?: 0)
		return result
	}
}

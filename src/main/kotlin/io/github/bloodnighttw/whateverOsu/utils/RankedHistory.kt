package io.github.bloodnighttw.whateverOsu.utils

data class RankedHistory(
	val mode: OsuMode,
	val data: Array<Long>
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is RankedHistory) return false

		if (mode != other.mode) return false
		if (!data.contentEquals(other.data)) return false

		return true
	}

	override fun hashCode(): Int {
		var result = mode.hashCode()
		result = 31 * result + data.contentHashCode()
		return result
	}

	override fun toString(): String {
		return "RankedHistory(mode=$mode, data=${data.contentToString()})"
	}
}
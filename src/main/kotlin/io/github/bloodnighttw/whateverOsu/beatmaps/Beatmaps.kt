package io.github.bloodnighttw.whateverOsu.beatmaps

data class Beatmaps(
	val beatmaps:Array<BeatmapCompact>
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is Beatmaps) return false

		if (!beatmaps.contentEquals(other.beatmaps)) return false

		return true
	}

	override fun hashCode(): Int {
		return beatmaps.contentHashCode()
	}
}

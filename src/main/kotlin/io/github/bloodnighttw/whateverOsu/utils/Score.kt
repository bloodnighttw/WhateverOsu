package io.github.bloodnighttw.whateverOsu.utils

import com.google.gson.annotations.SerializedName
import io.github.bloodnighttw.whateverOsu.beatmaps.Beatmap
import io.github.bloodnighttw.whateverOsu.beatmaps.BeatmapStatistics
import io.github.bloodnighttw.whateverOsu.beatmaps.Beatmapset
import io.github.bloodnighttw.whateverOsu.user.User
import java.util.*

data class Score(
	val id: Long,
	@SerializedName("best_id") val bestId: Long?,
	@SerializedName("user_id") val userId: Long,
	val accuracy: Double,
	val mods: Array<String>,
	val score: Long,
	@SerializedName("max_combo") val maxCombo: Int,
	val perfect: Boolean,
	val statistics: BeatmapStatistics,
	val passed: Boolean,
	val pp: Double,
	val rank: String,
	@SerializedName("created_at") val createAt: Date, // need to define format
	val mode: OsuMode,
	@SerializedName("mode_int") val modeInt: Int,
	val replay: Boolean,
	val beatmap: Beatmap,
	val beatmapset: Beatmapset,
	@SerializedName("rank_country") val rankCountry: String?,
	@SerializedName("rank_global") val rankGlobal: String?,
	val weight: Any,
	val user: User,
	val match: Any
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as Score

		if (id != other.id) return false
		if (bestId != other.bestId) return false
		if (userId != other.userId) return false
		if (accuracy != other.accuracy) return false
		if (!mods.contentEquals(other.mods)) return false
		if (score != other.score) return false
		if (maxCombo != other.maxCombo) return false
		if (perfect != other.perfect) return false
		if (statistics != other.statistics) return false
		if (passed != other.passed) return false
		if (pp != other.pp) return false
		if (rank != other.rank) return false
		if (createAt != other.createAt) return false
		if (mode != other.mode) return false
		if (modeInt != other.modeInt) return false
		if (replay != other.replay) return false
		if (beatmap != other.beatmap) return false
		if (beatmapset != other.beatmapset) return false
		if (rankCountry != other.rankCountry) return false
		if (rankGlobal != other.rankGlobal) return false
		if (weight != other.weight) return false
		if (user != other.user) return false
		if (match != other.match) return false

		return true
	}

	override fun hashCode(): Int {
		var result = id.hashCode()
		result = 31 * result + bestId.hashCode()
		result = 31 * result + userId.hashCode()
		result = 31 * result + accuracy.hashCode()
		result = 31 * result + mods.contentHashCode()
		result = 31 * result + score.hashCode()
		result = 31 * result + maxCombo
		result = 31 * result + perfect.hashCode()
		result = 31 * result + statistics.hashCode()
		result = 31 * result + passed.hashCode()
		result = 31 * result + pp.hashCode()
		result = 31 * result + rank.hashCode()
		result = 31 * result + createAt.hashCode()
		result = 31 * result + mode.hashCode()
		result = 31 * result + modeInt
		result = 31 * result + replay.hashCode()
		result = 31 * result + beatmap.hashCode()
		result = 31 * result + beatmapset.hashCode()
		result = 31 * result + (rankCountry?.hashCode() ?: 0)
		result = 31 * result + (rankGlobal?.hashCode() ?: 0)
		result = 31 * result + weight.hashCode()
		result = 31 * result + user.hashCode()
		result = 31 * result + match.hashCode()
		return result
	}
}
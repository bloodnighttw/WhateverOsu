package io.github.bloodnighttw.whateverOsu.beatmaps

import com.google.gson.annotations.SerializedName
import io.github.bloodnighttw.whateverOsu.utils.OsuMode
import io.github.bloodnighttw.whateverOsu.utils.RankStatus
import java.util.*

class Beatmap(
	beatmapSetId: Int,
	difficultyRating: Double,
	id: Long,
	mode: OsuMode,
	status: RankStatus,
	totalLength: Long,
	userId: Long,
	version: String,
	val accuracy:Double,
	val ar:Double,
	val bpm:Double,
	val convert:Boolean,
	@SerializedName("count_circles") val countCircles:Int,
	@SerializedName("count_sliders") val countSliders:Int,
	@SerializedName("count_spinners") val countSpinners:Int,
	val cs:Double,
	@SerializedName("deleted_at") val deletedAt:Date?,
	val drain:Double,
	@SerializedName("hit_length") val hitLength:Int,
	@SerializedName("is_scoreable") val isScoreable:Boolean,
	@SerializedName("last_updated") val lastUpdated:Date,
	@SerializedName("mode_int") val modeInt: Int,
	@SerializedName("passcount") val passcount:Int,
	@SerializedName("playcount") val playcount:Int,
	val ranked: RankStatus,
	val url:String
) : BeatmapCompact(beatmapSetId, difficultyRating, id, mode, status, totalLength, userId, version){

	override fun toString(): String {
		return "Beatmap(accuracy=$accuracy, ar=$ar, bpm=$bpm, convert=$convert, countCircles=$countCircles, countSliders=$countSliders, countSpinners=$countSpinners, cs=$cs, deletedAt=$deletedAt, drain=$drain, hitLength=$hitLength, isScoreable=$isScoreable, lastUpdated=$lastUpdated, modeInt=$modeInt, passcount=$passcount, playcount=$playcount, ranked=$ranked, url='$url')"
	}

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is Beatmap) return false
		if (!super.equals(other)) return false

		if (accuracy != other.accuracy) return false
		if (ar != other.ar) return false
		if (bpm != other.bpm) return false
		if (convert != other.convert) return false
		if (countCircles != other.countCircles) return false
		if (countSliders != other.countSliders) return false
		if (countSpinners != other.countSpinners) return false
		if (cs != other.cs) return false
		if (deletedAt != other.deletedAt) return false
		if (drain != other.drain) return false
		if (hitLength != other.hitLength) return false
		if (isScoreable != other.isScoreable) return false
		if (lastUpdated != other.lastUpdated) return false
		if (modeInt != other.modeInt) return false
		if (passcount != other.passcount) return false
		if (playcount != other.playcount) return false
		if (ranked != other.ranked) return false
		if (url != other.url) return false

		return true
	}

	override fun hashCode(): Int {
		var result = super.hashCode()
		result = 31 * result + accuracy.hashCode()
		result = 31 * result + ar.hashCode()
		result = 31 * result + bpm.hashCode()
		result = 31 * result + convert.hashCode()
		result = 31 * result + countCircles
		result = 31 * result + countSliders
		result = 31 * result + countSpinners
		result = 31 * result + cs.hashCode()
		result = 31 * result + (deletedAt?.hashCode() ?: 0)
		result = 31 * result + drain.hashCode()
		result = 31 * result + hitLength
		result = 31 * result + isScoreable.hashCode()
		result = 31 * result + lastUpdated.hashCode()
		result = 31 * result + modeInt
		result = 31 * result + passcount
		result = 31 * result + playcount
		result = 31 * result + ranked.hashCode()
		result = 31 * result + url.hashCode()
		return result
	}


}
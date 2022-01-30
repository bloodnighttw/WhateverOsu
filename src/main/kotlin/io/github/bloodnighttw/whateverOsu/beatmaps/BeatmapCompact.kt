package io.github.bloodnighttw.whateverOsu.beatmaps

import com.google.gson.annotations.SerializedName
import io.github.bloodnighttw.whateverOsu.utils.OsuMode
import io.github.bloodnighttw.whateverOsu.utils.RankStatus
import java.lang.reflect.Type

open class BeatmapCompact (
	@SerializedName("beatmapset_id") val beatmapSetId:Int,
	@SerializedName("difficulty_rating") val difficultyRating:Double,
	val id:Long,
	val mode: OsuMode,
	val status: RankStatus,
	@SerializedName("total_length") val totalLength:Long,
	@SerializedName("user_id") val userId:Long,
	val version: String
){
	override fun toString(): String {
		return "BeatmapCompact(beatmapSetId=$beatmapSetId, difficultyRating=$difficultyRating, id=$id, mode=$mode, status=$status, totalLength=$totalLength, userId=$userId, version='$version')"
	}

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is BeatmapCompact) return false

		if (beatmapSetId != other.beatmapSetId) return false
		if (difficultyRating != other.difficultyRating) return false
		if (id != other.id) return false
		if (mode != other.mode) return false
		if (status != other.status) return false
		if (totalLength != other.totalLength) return false
		if (userId != other.userId) return false
		if (version != other.version) return false

		return true
	}

	override fun hashCode(): Int {
		var result = beatmapSetId
		result = 31 * result + difficultyRating.hashCode()
		result = 31 * result + id.hashCode()
		result = 31 * result + mode.hashCode()
		result = 31 * result + status.hashCode()
		result = 31 * result + totalLength.hashCode()
		result = 31 * result + userId.hashCode()
		result = 31 * result + version.hashCode()
		return result
	}


}
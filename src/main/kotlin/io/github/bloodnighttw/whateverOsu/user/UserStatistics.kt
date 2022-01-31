package io.github.bloodnighttw.whateverOsu.user

import com.google.gson.annotations.SerializedName
import io.github.bloodnighttw.whateverOsu.utils.GradeCount
import io.github.bloodnighttw.whateverOsu.utils.Level

data class UserStatistics(
	val level: Level,
	@SerializedName("global_rank") val globalRank: Long,
	val pp: Double,
	@SerializedName("ranked_score") val rankedScore: Long,
	@SerializedName("hit_accuracy") val hitAccuracy: Double,
	@SerializedName("play_count") val playCount: Long,
	@SerializedName("play_time") val playTime: Long,
	@SerializedName("total_score") val totalScore: Long,
	@SerializedName("total_hits") val totalHits: Long,
	@SerializedName("maximum_combo") val maxCombo: Long,
	@SerializedName("replays_watched_by_others") val replayWatchedCount: Long,
	@SerializedName("is_ranked") val isRanked: Boolean,
	@SerializedName("grade_counts") val gradeCount: GradeCount,
	@SerializedName("country_rank") val countryRanked: Long

)

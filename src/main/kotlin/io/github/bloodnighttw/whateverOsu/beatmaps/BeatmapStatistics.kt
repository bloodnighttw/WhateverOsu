package io.github.bloodnighttw.whateverOsu.beatmaps

import com.google.gson.annotations.SerializedName

data class BeatmapStatistics(
	@SerializedName("count_50") val count50: Int,
	@SerializedName("count_100") val count100: Int,
	@SerializedName("count_300") val count300: Int,
	@SerializedName("count_geki") val count300k: Int,
	@SerializedName("count_katu") val count100k: Int,
	@SerializedName("count_miss") val miss: Int
)

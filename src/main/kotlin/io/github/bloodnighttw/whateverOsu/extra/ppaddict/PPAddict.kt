package io.github.bloodnighttw.whateverOsu.extra.ppaddict

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BeatmapinfoService {
	@GET("/beatmapinfo")
	fun getBeatmapInfo(
		@Query("k") token: String,
		@Query("beatmapid") beatmapid: Long,
		@Query("acc") acc: Double? = null,
		@Query("wait") waitTime: Int = 1000
	): Call<BeatmapInfo>
}

data class BeatmapInfo(
	val beatmapid: Long,
	val mod: Int,
	val oppaiOnly: Boolean,
	val ppForAcc: Map<Double, Double>,
	val starDiff: Double
)
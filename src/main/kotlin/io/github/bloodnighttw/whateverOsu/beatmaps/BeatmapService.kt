package io.github.bloodnighttw.whateverOsu.beatmaps

import io.github.bloodnighttw.whateverOsu.utils.OsuMode
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface BeatmapService {

	@GET("/api/v2/beatmaps/{map_id}/scores/users/{user_id}")
	fun getBeatmapsUserScore(@Header("Authorization") auth:String, @Path("map_id") mapId:Int, @Path("user_id") userId:Int,@Query("mode")mode:OsuMode):Call<BeatmapUserScore>

	@GET("/api/v2/beatmaps/{map_id}/scores")
	fun getBeatmapsScores(@Header("Authorization")auth: String,@Path("map_id")mapId: Int,@Query("mode")mode:OsuMode):Call<BeatmapScores>

	@GET("/api/v2/beatmaps/{map_id}")
	fun getBeatmapInfo(@Header("Authorization") auth: String, @Path("map_id") mapId: Int , @Query("mode") mode:OsuMode? = null):Call<Beatmap>

	@GET("/api/v2/beatmaps")
	fun getBeatmaps(@Header("Authorization") auth: String,@Query("ids[]") ids:String):Call<Beatmaps>


}
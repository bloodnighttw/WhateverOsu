package io.github.bloodnighttw.whateverOsu.beatmaps

import com.google.gson.annotations.SerializedName
import io.github.bloodnighttw.whateverOsu.utils.Availability
import io.github.bloodnighttw.whateverOsu.utils.Covers
import io.github.bloodnighttw.whateverOsu.utils.Hype
import io.github.bloodnighttw.whateverOsu.utils.RankStatus
import java.util.*

class Beatmapset(
	artist: String,
	artistUnicode: String,
	covers: Covers,
	creator: String,
	favouriteCount: Long,
	id: Long,
	nsfw: Boolean,
	playCount: Long,
	previewUrl: String,
	source: String,
	status: RankStatus,
	title: String,
	titleUnicode: String,
	userId: Number,
	video: Boolean,
	beatmaps: Array<Beatmap>,
	converts: Any?,
	currentUserAttributes: Any?,
	description: Any?,
	discussions: Any?,
	events: Any?,
	genre: Any?,
	hasFavourited: Boolean?,
	language: Any?,
	nominations: Hype?,
	ratings: Any?,
	recentFavourites: Any?,
	relatedUsers: Any?,
	user: Any?,

	val availability: Availability,
	val bpm:Double,
	@SerializedName("can_be_hyped") val canBeHyped:Boolean,
	@SerializedName("discussion_enabled") val discussionEnabled:Boolean,
	@SerializedName("discussion_locked") val discussionLocked:Boolean,
	val hype: Hype,
	@SerializedName("is_scoreable") val isScoreable:Boolean,
	@SerializedName("last_updated")	val lastUpdated:Date,
	@SerializedName("legacy_thread_url") val legacy_thread_url:String?,
	val ranked: RankStatus,
	@SerializedName("ranked_date") val rankedData:Date?,
	val storyboard:Boolean,
	@SerializedName("submitted_date") val submittedData:Date?,
	val tags:String

) : BeatmapsetCompact(
	artist,
	artistUnicode,
	covers,
	creator,
	favouriteCount,
	id,
	nsfw,
	playCount,
	previewUrl,
	source,
	status,
	title,
	titleUnicode,
	userId,
	video,
	beatmaps,
	converts,
	currentUserAttributes,
	description,
	discussions,
	events,
	genre,
	hasFavourited,
	language,
	nominations,
	ratings,
	recentFavourites,
	relatedUsers,
	user
) {

}
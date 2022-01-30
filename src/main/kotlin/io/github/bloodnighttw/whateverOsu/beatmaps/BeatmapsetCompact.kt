package io.github.bloodnighttw.whateverOsu.beatmaps

import com.google.gson.annotations.SerializedName
import io.github.bloodnighttw.whateverOsu.utils.Covers
import io.github.bloodnighttw.whateverOsu.utils.Hype
import io.github.bloodnighttw.whateverOsu.utils.RankStatus

open class BeatmapsetCompact(
	val artist:String,
	@SerializedName("artist_unicode") val artistUnicode:String,
	val covers: Covers,
	val creator:String,
	@SerializedName("favourite_count") val favouriteCount:Long,
	val id:Long,
	val nsfw:Boolean,
	@SerializedName("play_count") val playCount:Long,
	@SerializedName("preview_url") val previewUrl:String,
	val source:String,
	val status: RankStatus,
	val title:String,
	@SerializedName("title_unicode") val titleUnicode:String,
	@SerializedName("user_id") val userId:Number,
	val video:Boolean,
	val beatmaps:Array<Beatmap>,
	val converts:Any?,
	@SerializedName("current_user_attributes") val currentUserAttributes:Any?,
	val description:Any?,
	val discussions:Any?,
	val events:Any?,
	val genre:Any?,
	val hasFavourited:Boolean?,
	val language:Any?,
	val nominations: Hype?,
	val ratings:Any?,
	@SerializedName("recent_favourites") val recentFavourites:Any?,
	@SerializedName("related_users") val relatedUsers:Any?,
	val user:Any?
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as BeatmapsetCompact

		if (artist != other.artist) return false
		if (artistUnicode != other.artistUnicode) return false
		if (covers != other.covers) return false
		if (creator != other.creator) return false
		if (favouriteCount != other.favouriteCount) return false
		if (id != other.id) return false
		if (nsfw != other.nsfw) return false
		if (playCount != other.playCount) return false
		if (previewUrl != other.previewUrl) return false
		if (source != other.source) return false
		if (status != other.status) return false
		if (title != other.title) return false
		if (titleUnicode != other.titleUnicode) return false
		if (userId != other.userId) return false
		if (video != other.video) return false
		if (!beatmaps.contentEquals(other.beatmaps)) return false
		if (converts != other.converts) return false
		if (currentUserAttributes != other.currentUserAttributes) return false
		if (description != other.description) return false
		if (discussions != other.discussions) return false
		if (events != other.events) return false
		if (genre != other.genre) return false
		if (hasFavourited != other.hasFavourited) return false
		if (language != other.language) return false
		if (nominations != other.nominations) return false
		if (ratings != other.ratings) return false
		if (recentFavourites != other.recentFavourites) return false
		if (relatedUsers != other.relatedUsers) return false
		if (user != other.user) return false

		return true
	}

	override fun hashCode(): Int {
		var result = artist.hashCode()
		result = 31 * result + artistUnicode.hashCode()
		result = 31 * result + covers.hashCode()
		result = 31 * result + creator.hashCode()
		result = 31 * result + favouriteCount.hashCode()
		result = 31 * result + id.hashCode()
		result = 31 * result + nsfw.hashCode()
		result = 31 * result + playCount.hashCode()
		result = 31 * result + previewUrl.hashCode()
		result = 31 * result + source.hashCode()
		result = 31 * result + status.hashCode()
		result = 31 * result + title.hashCode()
		result = 31 * result + titleUnicode.hashCode()
		result = 31 * result + userId.hashCode()
		result = 31 * result + video.hashCode()
		result = 31 * result + beatmaps.contentHashCode()
		result = 31 * result + (converts?.hashCode() ?: 0)
		result = 31 * result + (currentUserAttributes?.hashCode() ?: 0)
		result = 31 * result + (description?.hashCode() ?: 0)
		result = 31 * result + (discussions?.hashCode() ?: 0)
		result = 31 * result + (events?.hashCode() ?: 0)
		result = 31 * result + (genre?.hashCode() ?: 0)
		result = 31 * result + (hasFavourited?.hashCode() ?: 0)
		result = 31 * result + (language?.hashCode() ?: 0)
		result = 31 * result + (nominations?.hashCode() ?: 0)
		result = 31 * result + (ratings?.hashCode() ?: 0)
		result = 31 * result + (recentFavourites?.hashCode() ?: 0)
		result = 31 * result + (relatedUsers?.hashCode() ?: 0)
		result = 31 * result + (user?.hashCode() ?: 0)
		return result
	}
}

// nodone

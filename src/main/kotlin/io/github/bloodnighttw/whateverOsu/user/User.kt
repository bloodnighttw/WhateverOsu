package io.github.bloodnighttw.whateverOsu.user

import com.google.gson.annotations.SerializedName
import io.github.bloodnighttw.whateverOsu.utils.Page
import io.github.bloodnighttw.whateverOsu.utils.RankedHistory
import java.util.*

class User(
	@SerializedName("avatar_url") val avatarUrl: String,
	@SerializedName("country_code") val countryCode: String,
	@SerializedName("default_group") val defaultGroup: String,
	val id: Long,
	@SerializedName("is_active") val isActive: Boolean,
	@SerializedName("is_bot") val isBot: Boolean,
	@SerializedName("is_deleted") val isDeleted: Boolean,
	@SerializedName("is_online") val isOnline: Boolean,
	@SerializedName("is_supporter") val isSupporter: Boolean,
	@SerializedName("last_visit") val lastVisit: Date?,
	@SerializedName("pm_friends_only") val pmFriendsOnly: Boolean,
	@SerializedName("profile_colour") val profileColour: String?, // HEX e.g. #333333
	val username: String,
	@SerializedName("account_history") val accountHistory: Array<UserAccountHistory>?,
	@SerializedName("active_tournament_banner") val activeTournamentBanner: ProfileBanner?,
	val badges: Array<UserBadge>?,
	@SerializedName("beatmap_playcounts_count") val beatmapPlaycountsCount: Long?,
	val blocks: Any?,
	val country: Any?,
	val cover: Any?,
	@SerializedName("favourite_beatmapset_count") val favouriteBeatmapsetCount: Long?,
	@SerializedName("follower_count") val followerCount: Long?,
	val friends: Any?,
	@SerializedName("graveyard_beatmapset_count") val graveyardBeatmapsetCount: Long?,
	val groups: Array<UserGroup>?,
	@SerializedName("is_restricted") val isRestricted: Boolean?,
	@SerializedName("loved_beatmapset_count") val lovedBeatmapsetCount: Long?,
	@SerializedName("monthly_playcounts") val monthlyPlaycounts: Array<DateAndCount>?,
	val page: Page?,
	@SerializedName("pending_beatmapset_count") val pendingBeatmapsetCount: Long?,
	@SerializedName("previous_usernames") val previousUsernames: Array<String>?,
	@SerializedName("ranked_beatmapset_count") val rankedBeatmapsetCount: Long?,
	@SerializedName("replays_watched_counts") val replaysWatched: Array<DateAndCount>?,
	@SerializedName("scores_best_count") val scoresBestCount: Long?,
	@SerializedName("scores_first_count") val scoresFirstCount: Long?,
	@SerializedName("scores_recent_count") val scoresRecentCount: Long?,
	val statistics: UserStatistics?,
	val supportLevel: Number?,
	@SerializedName("user_achievements") val userAchievements: Array<Achievement>?,
	val rankHistory: RankedHistory?

) {
	override fun toString(): String {
		return "User(avatarUrl='$avatarUrl', countryCode='$countryCode', defaultGroup='$defaultGroup', id=$id, isActive=$isActive, isBot=$isBot, isDeleted=$isDeleted, isOnline=$isOnline, isSupporter=$isSupporter, lastVisit=$lastVisit, pmFriendsOnly=$pmFriendsOnly, profileColour=$profileColour, username='$username', accountHistory=${accountHistory?.contentToString()}, activeTournamentBanner=$activeTournamentBanner, badges=${badges?.contentToString()}, beatmapPlaycountsCount=$beatmapPlaycountsCount, blocks=$blocks, country=$country, cover=$cover, favouriteBeatmapsetCount=$favouriteBeatmapsetCount, followerCount=$followerCount, friends=$friends, graveyardBeatmapsetCount=$graveyardBeatmapsetCount, groups=${groups?.contentToString()}, isRestricted=$isRestricted, lovedBeatmapsetCount=$lovedBeatmapsetCount, monthlyPlaycounts=${monthlyPlaycounts?.contentToString()}, page=$page, pendingBeatmapsetCount=$pendingBeatmapsetCount, previousUsernames=${previousUsernames?.contentToString()}, rankedBeatmapsetCount=$rankedBeatmapsetCount, replaysWatched=${replaysWatched?.contentToString()}, scoresBestCount=$scoresBestCount, scoresFirstCount=$scoresFirstCount, scoresRecentCount=$scoresRecentCount, statistics=$statistics, supportLevel=$supportLevel, userAchievements=${userAchievements?.contentToString()}, rankedHistory=$rankHistory)"
	}

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is User) return false

		if (avatarUrl != other.avatarUrl) return false
		if (countryCode != other.countryCode) return false
		if (defaultGroup != other.defaultGroup) return false
		if (id != other.id) return false
		if (isActive != other.isActive) return false
		if (isBot != other.isBot) return false
		if (isDeleted != other.isDeleted) return false
		if (isOnline != other.isOnline) return false
		if (isSupporter != other.isSupporter) return false
		if (lastVisit != other.lastVisit) return false
		if (pmFriendsOnly != other.pmFriendsOnly) return false
		if (profileColour != other.profileColour) return false
		if (username != other.username) return false
		if (accountHistory != null) {
			if (other.accountHistory == null) return false
			if (!accountHistory.contentEquals(other.accountHistory)) return false
		} else if (other.accountHistory != null) return false
		if (activeTournamentBanner != other.activeTournamentBanner) return false
		if (badges != null) {
			if (other.badges == null) return false
			if (!badges.contentEquals(other.badges)) return false
		} else if (other.badges != null) return false
		if (beatmapPlaycountsCount != other.beatmapPlaycountsCount) return false
		if (blocks != other.blocks) return false
		if (country != other.country) return false
		if (cover != other.cover) return false
		if (favouriteBeatmapsetCount != other.favouriteBeatmapsetCount) return false
		if (followerCount != other.followerCount) return false
		if (friends != other.friends) return false
		if (graveyardBeatmapsetCount != other.graveyardBeatmapsetCount) return false
		if (groups != null) {
			if (other.groups == null) return false
			if (!groups.contentEquals(other.groups)) return false
		} else if (other.groups != null) return false
		if (isRestricted != other.isRestricted) return false
		if (lovedBeatmapsetCount != other.lovedBeatmapsetCount) return false
		if (monthlyPlaycounts != null) {
			if (other.monthlyPlaycounts == null) return false
			if (!monthlyPlaycounts.contentEquals(other.monthlyPlaycounts)) return false
		} else if (other.monthlyPlaycounts != null) return false
		if (page != other.page) return false
		if (pendingBeatmapsetCount != other.pendingBeatmapsetCount) return false
		if (previousUsernames != null) {
			if (other.previousUsernames == null) return false
			if (!previousUsernames.contentEquals(other.previousUsernames)) return false
		} else if (other.previousUsernames != null) return false
		if (rankedBeatmapsetCount != other.rankedBeatmapsetCount) return false
		if (replaysWatched != null) {
			if (other.replaysWatched == null) return false
			if (!replaysWatched.contentEquals(other.replaysWatched)) return false
		} else if (other.replaysWatched != null) return false
		if (scoresBestCount != other.scoresBestCount) return false
		if (scoresFirstCount != other.scoresFirstCount) return false
		if (scoresRecentCount != other.scoresRecentCount) return false
		if (statistics != other.statistics) return false
		if (supportLevel != other.supportLevel) return false
		if (userAchievements != null) {
			if (other.userAchievements == null) return false
			if (!userAchievements.contentEquals(other.userAchievements)) return false
		} else if (other.userAchievements != null) return false
		if (rankHistory != other.rankHistory) return false

		return true
	}

	override fun hashCode(): Int {
		var result = avatarUrl.hashCode()
		result = 31 * result + countryCode.hashCode()
		result = 31 * result + defaultGroup.hashCode()
		result = 31 * result + id.hashCode()
		result = 31 * result + isActive.hashCode()
		result = 31 * result + isBot.hashCode()
		result = 31 * result + isDeleted.hashCode()
		result = 31 * result + isOnline.hashCode()
		result = 31 * result + isSupporter.hashCode()
		result = 31 * result + (lastVisit?.hashCode() ?: 0)
		result = 31 * result + pmFriendsOnly.hashCode()
		result = 31 * result + (profileColour?.hashCode() ?: 0)
		result = 31 * result + username.hashCode()
		result = 31 * result + (accountHistory?.contentHashCode() ?: 0)
		result = 31 * result + (activeTournamentBanner?.hashCode() ?: 0)
		result = 31 * result + (badges?.contentHashCode() ?: 0)
		result = 31 * result + (beatmapPlaycountsCount?.hashCode() ?: 0)
		result = 31 * result + (blocks?.hashCode() ?: 0)
		result = 31 * result + (country?.hashCode() ?: 0)
		result = 31 * result + (cover?.hashCode() ?: 0)
		result = 31 * result + (favouriteBeatmapsetCount?.hashCode() ?: 0)
		result = 31 * result + (followerCount?.hashCode() ?: 0)
		result = 31 * result + (friends?.hashCode() ?: 0)
		result = 31 * result + (graveyardBeatmapsetCount?.hashCode() ?: 0)
		result = 31 * result + (groups?.contentHashCode() ?: 0)
		result = 31 * result + (isRestricted?.hashCode() ?: 0)
		result = 31 * result + (lovedBeatmapsetCount?.hashCode() ?: 0)
		result = 31 * result + (monthlyPlaycounts?.contentHashCode() ?: 0)
		result = 31 * result + (page?.hashCode() ?: 0)
		result = 31 * result + (pendingBeatmapsetCount?.hashCode() ?: 0)
		result = 31 * result + (previousUsernames?.contentHashCode() ?: 0)
		result = 31 * result + (rankedBeatmapsetCount?.hashCode() ?: 0)
		result = 31 * result + (replaysWatched?.contentHashCode() ?: 0)
		result = 31 * result + (scoresBestCount?.hashCode() ?: 0)
		result = 31 * result + (scoresFirstCount?.hashCode() ?: 0)
		result = 31 * result + (scoresRecentCount?.hashCode() ?: 0)
		result = 31 * result + (statistics?.hashCode() ?: 0)
		result = 31 * result + (supportLevel?.hashCode() ?: 0)
		result = 31 * result + (userAchievements?.contentHashCode() ?: 0)
		result = 31 * result + (rankHistory?.hashCode() ?: 0)
		return result
	}


}
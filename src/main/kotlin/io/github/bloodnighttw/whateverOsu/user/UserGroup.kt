package io.github.bloodnighttw.whateverOsu.user

data class UserGroup(
	val playmodes: Array<String>?
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is UserGroup) return false

		if (playmodes != null) {
			if (other.playmodes == null) return false
			if (!playmodes.contentEquals(other.playmodes)) return false
		} else if (other.playmodes != null) return false

		return true
	}

	override fun hashCode(): Int {
		return playmodes?.contentHashCode() ?: 0
	}
}

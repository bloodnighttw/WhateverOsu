package io.github.bloodnighttw.whateverOsu.user

import io.github.bloodnighttw.whateverOsu.utils.HistoryType
import java.util.*

data class UserAccountHistory(
	val description: String?,
	val id: Long,
	val length: Long,
	val timestamp: Date,
	val type: HistoryType
)

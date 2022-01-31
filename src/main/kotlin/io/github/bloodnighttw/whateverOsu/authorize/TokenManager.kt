package io.github.bloodnighttw.whateverOsu.authorize

import io.github.bloodnighttw.whateverOsu.authorizeService

private var expireTimeMiles: Long = 0

private fun refreshToken(clientId: String, clientSecret: String) {
	expireTimeMiles = System.currentTimeMillis()
	val task = authorizeService.getToken(Authorize(clientId, clientSecret)).execute()
	if (task.isSuccessful) {
		token = task.body()!!.accessToken
		expireTimeMiles += task.body()!!.expiresIn * 1000
	} else {
		token = null
	}
}

private var token: String? = null

fun getToken(clientId: String, clientSecret: String): String? {
	val nowTime = System.currentTimeMillis()
	if (nowTime > expireTimeMiles)
		refreshToken(clientId, clientSecret)
	return token
}
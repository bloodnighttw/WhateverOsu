package io.github.bloodnighttw.whateverOsu.authorize

import org.junit.jupiter.api.Test

internal class TokenManagerKtTest {
	@Test
	fun getToken() {
		val start = System.currentTimeMillis()
		io.github.bloodnighttw.whateverOsu.authorize.getToken(System.getenv("CLIENT_ID")!!, System.getenv("CS")!!)
		val first = System.currentTimeMillis()
		io.github.bloodnighttw.whateverOsu.authorize.getToken(System.getenv("CLIENT_ID")!!, System.getenv("CS")!!)
		val end = System.currentTimeMillis()
		println(first - start)
		println(end - first)
		assert((end - first) < (first - start))
	}
}
package io.github.bloodnighttw.whateverOsu.authorize

import com.google.gson.annotations.SerializedName

class Token{
	@SerializedName("token_type") val tokenType:TokenType = TokenType.Bearer
	@SerializedName("access_token") val accessToken = ""
		get() = "$tokenType $field"
	@SerializedName("expires_in") val expiresIn:Int = 0
	override fun toString(): String {
		return "Token(tokenType=$tokenType, accessToken='$accessToken', expiresIn=$expiresIn)"
	}

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is Token) return false

		if (tokenType != other.tokenType) return false
		if (expiresIn != other.expiresIn) return false

		return true
	}

	override fun hashCode(): Int {
		var result = tokenType.hashCode()
		result = 31 * result + expiresIn
		return result
	}
}




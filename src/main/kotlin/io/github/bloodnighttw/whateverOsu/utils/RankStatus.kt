package io.github.bloodnighttw.whateverOsu.utils

import com.google.gson.annotations.SerializedName

enum class RankStatus(i: String) {
	@SerializedName("-2", alternate = ["graveyard"]) 	GRAVEYARD("graveyard"),
	@SerializedName("-1" , alternate = ["wip"]) 		WIP("wip"),
	@SerializedName("0" , alternate = ["pending"] ) 	PENDING("pending"),
	@SerializedName("1" , alternate = ["ranked"]) 		RANKED("ranked"),
	@SerializedName("2" , alternate = ["approved"])		APPROVED("approved"),
	@SerializedName("3" , alternate = ["qualified"])	QUALIFIED("qualified"),
	@SerializedName("4" , alternate = ["loved"])		LOVED("loved")
}




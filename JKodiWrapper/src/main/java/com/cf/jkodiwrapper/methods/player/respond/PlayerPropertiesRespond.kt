package com.cf.jkodiwrapper.methods.player.respond

import com.cf.jkodiwrapper.general.respond.KodiRespond
import com.cf.jkodiwrapper.types.player.PlayerPropertyValue
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class PlayerPropertiesRespond(var result: PlayerPropertyValue? = null) : KodiRespond() {

    override fun equals(other: Any?): Boolean {
        val obj = other as? PlayerPropertiesRespond ?: return false
        return result == obj.result && super.equals(other)
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + result.hashCode()
        return result
    }
}
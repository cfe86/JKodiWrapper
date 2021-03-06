package com.cf.jkodiwrapper.methods.files.respond

import com.cf.jkodiwrapper.general.respond.KodiRespond
import com.cf.jkodiwrapper.methods.files.respond.entity.PreparedDownload
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class PrepareDownloadRespond(var result: PreparedDownload? = null) : KodiRespond() {

    override fun equals(other: Any?): Boolean {
        val obj = other as? PrepareDownloadRespond ?: return false
        return result == obj.result && super.equals(other)
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + result.hashCode()
        return result
    }
}
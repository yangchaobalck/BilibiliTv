package com.jing.bilibilitv.http.data

import com.google.gson.annotations.SerializedName

data class VideoInfo(
    val id: Long,
    val bvid: String,
    val cid: Long,
    val goto: String,
    val uri: String,
    val pic: String,
    val title: String,
    val duration: Long,
    @SerializedName("pubdate")
    val pubDate: Long,
    @SerializedName("is_followed")
    val isFollowed: Int,
    @SerializedName("show_info")
    val showInfo: Int,
    @SerializedName("track_id")
    val trackId: String,
    val stat: VideoInfoStat,
    val owner: VideoInfoOwner
) {
    fun getDurationText(): String {
        if (duration <= 0) {
            return ""
        }
        val second = duration % 60
        val minute = duration / 60 % 60
        return minute.toString() + ':' + String.format("%02d", second)
    }
}

data class VideoInfoStat(
    val view: Int,
    val like: Int,
    @SerializedName("danmaku")
    val danmuku: Int
)

data class VideoInfoOwner(
    val mid: Long,
    val name: String,
    val face: String
)
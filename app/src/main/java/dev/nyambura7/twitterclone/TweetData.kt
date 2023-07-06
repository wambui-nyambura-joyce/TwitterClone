package dev.nyambura7.twitterclone

data class TweetData(
    var avatar: String,
    var displayName: String,
    var handle: String,
    var tweet: String,
    var replyCount: Int,
    var rtCount: Int,
    var likeCount: Int
)

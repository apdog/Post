package org.example

data class Likes(
    val count: Int,
    val userLikes: Int,
    val canLike: Boolean,
    val canPublish: Boolean
)

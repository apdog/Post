package org.example

data class Likes(
    val count: Int = 0,
    val userLikes: Int,
    val canLike: Boolean
)
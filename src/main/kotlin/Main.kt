package org.example

import java.util.*

fun main() {
    val post1 = Post(
        id = 0,
        fromId = 3559,
        date = Date(),
        text = "mucius",
        friendsOnly = false,
        comments = null,
        likes = Likes(count = 8672, userLikes = 8887, canLike = false, canPublish = false),
        reposts = Reposts(count = 8635, userReposted = false),
        views = Views(count = 8781),
        attachments = listOf(),
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false
    )
    WallService.add(post1)

    val post2 = Post(
        id = 0,
        fromId = 53,
        date = Date(),
        text = "regenerate",
        friendsOnly = true,
        comments = null,
        likes = Likes(count = 547, userLikes = 87, canLike = true, canPublish = true),
        reposts = Reposts(count = 54, userReposted = true),
        views = Views(count = 874),
        attachments = listOf(),
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true
    )

    val post3 = Post(
        id = 1,
        fromId = 53,
        date = Date(),
        text = "dthfhfhfh",
        friendsOnly = true,
        comments = mutableListOf<Comments>(),
        likes = Likes(count = 547, userLikes = 87, canLike = true, canPublish = true),
        reposts = Reposts(count = 54, userReposted = true),
        views = Views(count = 874),
        attachments = listOf(),
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true
    )
 val comment = Comments(
     id = 0,
     text = "Челмедведосвин"
 )

    val comment2 = Comments(
        id = 0,
        text = "Карамба!"
    )

    val comment3 = Comments(
        id = 0,
        text = "Эх"
    )
    with(WallService){
        add(post2)
        createComment(1,comment)
        createComment(1,comment2)
        createComment(1,comment3)
        update(post3)
        printPosts()
    }


}
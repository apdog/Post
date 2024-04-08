package org.example

import java.util.*

fun main() {
    val wallService = WallService
    val post1 = Post(
        fromId = 3559,
        date = Date(),
        text = "mucius",
        friendsOnly = false,
        comments = Comments(
            count = 9602,
            canPost = false,
            groupsCanPost = false,
            canClose = false,
            canOpen = false
        ),
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
        fromId = 53,
        date = Date(),
        text = "regenerate",
        friendsOnly = true,
        comments = Comments(
            count = 25,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
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

    WallService.add(post2)
    WallService.printPosts()

    val post3 = Post(
        id = 1,
        fromId = 6659,
        date = Date(),
        text = "et",
        friendsOnly = false,
        comments = Comments(
            count = 4930,
            canPost = false,
            groupsCanPost = false,
            canClose = false,
            canOpen = false
        ),
        likes = Likes(count = 6750, userLikes = 7920, canLike = false, canPublish = false),
        reposts = Reposts(count = 7912, userReposted = false),
        views = Views(count = 6958),
        attachments = listOf(),
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false
    )

    val updated = WallService.update(post3)
    if (updated){
        println("Пост успешно обновлен.")
    } else {
        println("Пост с указанным id не найден.")
    }
    WallService.printPosts()
 }
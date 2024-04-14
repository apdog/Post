package org.example

import org.example.attachments.Audio
import org.example.attachments.AudioAttachment
import org.example.attachments.File
import org.example.attachments.FileAttachment
import java.util.*

fun main() {

    val audio = Audio(
        id = 123,
        ownerId = 456,
        title = "I'm not afraid",
        artist = "Eminem",
        duration = 180,
        date = Date()
    )

    val file = File(
        id = 6347,
        title = "Таблица.xls",
        date =Date(),
        size = 9591
    )

    val post1 = Post(
        fromId = 3559,
        date = Date(),
        text = "Текст поста",
        comments = Comments(
            count = 9602
        ),
        likes = Likes(count = 8672, userLikes = 8887, canLike = false),
        reposts = Reposts(count = 8635, userReposted = false),
        views = Views(count = 8781),
        isPinned = false,
        attachments = listOf(AudioAttachment(audio), FileAttachment(file)),
    )
    WallService.add(post1)
    WallService.printPosts()

//    val post3 = Post(
//        id = 1,
//        fromId = 6659,
//        date = Date(),
//        text = "et",
//        comments = Comments(
//            count = 4930,
//        ),
//        likes = Likes(count = 6750, userLikes = 7920, canLike = false),
//        reposts = Reposts(count = 7912, userReposted = false),
//        views = Views(count = 6958),
//        isPinned = false,
//        attachments = listOf(),
//    )
//
//    val updated = WallService.update(post3)
//    if (updated) {
//        println("Пост успешно обновлен.")
//    } else {
//        println("Пост с указанным id не найден.")
//    }
//    WallService.printPosts()

}
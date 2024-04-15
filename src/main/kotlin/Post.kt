package org.example

import org.example.attachments.Attachment
import java.util.Date

data class Post(
    var id: Int? = null, // Уникальный номер записи
    val fromId: Int, // ID автора записи
    val date: Date, // Дата публикации записи
    val text: String?, // Текст записи
    val comments: Comments?, // Информация о комментариях
    val likes: Likes?, // Информация о лайках
    val reposts: Reposts?, // Информация о репостах
    val views: Views?, // Информация о просмотрах
    val isPinned: Boolean, // Закреплена ли запись
    val attachments: List<Attachment>?, // Массив объектов с медиавложениями: фото, видео, документы
)

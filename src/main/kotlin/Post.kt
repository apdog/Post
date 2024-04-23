package org.example

import java.util.Date

data class Post(
    var id: Int, // Уникальный номер записи
    val fromId: Int, // ID автора записи
    val date: Date, // Дата публикации записи
    val text: String?, // Текст записи
    val friendsOnly: Boolean, // если запись видна только друзьям
    var comments: MutableList<Comments>? = mutableListOf(), // Информация о комментариях
    val likes: Likes?, // Информация о лайках
    val reposts: Reposts?, // Информация о репостах
    val views: Views?, // Информация о просмотрах
    val attachments: List<Attachment>?, // Массив объектов с медиавложениями: фото, видео, документы
    val canPin: Boolean, // Может ли пользователь закрепить запись
    val canDelete: Boolean, // Может ли пользователь удалить запись
    val canEdit: Boolean, // Может ли пользователь редактировать запись
    val isPinned: Boolean, // Закреплена ли запись
    val markedAsAds: Boolean, // Содержит ли запись отметку "реклама"
    val isFavorite: Boolean, // Добавлена ли запись в закладки
)

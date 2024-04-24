package org.example

//сервис отвечающий за публикацию постов
object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comments>()

    // Переменная для хранения текущего идентификатора поста
    private var startPostsId = 1
    private var startCommentsId = 0
    //метод для создания постов

    //Как он должен работать:
    //добавлять запись в массив, но при этом назначать посту уникальный среди всех постов идентификатор;
    //возвращать пост с уже выставленным идентификатором.
    fun add(post: Post): Post {
        val newPost = post.copy(id = startPostsId++)
        // Инициализируем пустой список комментариев для нового поста
        newPost.comments = mutableListOf()
        posts += newPost
        return newPost
    }

    //метод для обновления постов

    //Как он должен работать:
    //находить среди всех постов запись с тем же id, что и у post и обновлять все свойства;
    //если пост с таким id не найден, то ничего не происходит и возвращается false, в противном случае – возвращается true.
    fun update(post: Post): Boolean {
        val index = posts.indexOfFirst { it.id == post.id }
        return if (index != -1) {
            // Создаем копию обновленного поста
            val updatedPost = post.copy()
            // Заменяем старый пост на обновленный
            posts[index] = updatedPost
            true
        } else {
            false
        }
    }

    fun printPosts() {
        for (post in posts) {
            println("ID Поста: ${post.id}, Комментариев: ${post.comments?.size}")
            post.comments?.forEach { comment ->
                println(" - Коммент ${comment.id}, Текст: ${comment.text}")
            }
        }
    }

    fun getPostById(postId: Int): Post? {
        return posts.find { it.id == postId }
    }

    fun createComment(postId: Int, comment: Comments): Comments {
        // проверка существует ли в массиве posts пост с ID равным postId
        val postIndex = posts.indexOfFirst { it.id == postId }
        if (postIndex != -1) {
            // добавить комментарий в массив и возвращаем его
            val newComment = comment.copy(id = posts[postIndex].comments?.size?.plus(1) ?: 0)
            comments += newComment
            posts[postIndex].comments?.add(newComment)
            return newComment
        } else {
            throw PostNotFoundException("Пост с ID $postId не найден")
        }
    }

    fun clearPosts() {
        posts = emptyArray()
        startPostsId = 0
    }

    fun clearComments() {
        comments = emptyArray()
        startCommentsId = 0
    }


}
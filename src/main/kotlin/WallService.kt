package org.example

//сервис отвечающий за публикацию постов
object WallService {

    private var posts = emptyArray<Post>()

    // Переменная для хранения текущего идентификатора поста
    private var initialId = 1
    //метод для создания постов

    //Как он должен работать:
    //добавлять запись в массив, но при этом назначать посту уникальный среди всех постов идентификатор;
    //возвращать пост с уже выставленным идентификатором.
    fun add(post: Post): Post {
        val newPost = post.copy(id = initialId++)
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
            posts[index] = post
            true
        } else {
            false
        }
    }

    fun printPosts() {
        for (post in posts) {
//            println("Пост с ID " + post.id + " имеет " + post.likes?.count + " лайка(ов)")
            with(post) {
                println(
                    "$id\n" + "$text\n" + "$comments\n" + "$likes\n" + "$reposts\n" + "$views\n" + "$attachments\n" + "$date\n"
                )
            }
        }
    }

    fun clear() {
        posts = emptyArray()
        initialId = 1
    }


}
import org.example.*
import org.example.WallService.add
import org.example.WallService.clear
import org.example.WallService.update
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.util.*

class WallServiceTest {
    @Test
    fun addPostIncrementsId() {
        // Создаем тестовый пост
        val post = Post(
            1,
            1,
            Date(),
            "Test post",
            Comments(0),
            Likes(0, 0, false),
            Reposts(0, false),
            Views(0),
            false,
            ArrayList(),
        )

        // Добавляем пост
        add(post)

        // Проверяем, что ID поста не равен 0
        assertNotEquals(0, post.id)
    }

    @Test
    fun updateExistingPostReturnsTrue() {
        // Создаем два поста с одинаковым ID
        val post1 = Post(
            1,
            1,
            Date(),
            "Test post 1",
            Comments(0),
            Likes(0, 0, false),
            Reposts(0, false),
            Views(0),
            false,
            ArrayList(),
        )
        val post2 = Post(
            1,
            1,
            Date(),
            "Updated test post 1",
            Comments(0),
            Likes(0, 0, false),
            Reposts(0, false),
            Views(0),
            false,
            ArrayList(),
        )

        // Добавляем первый пост
        add(post1)

        // Обновляем второй пост
        val updated = update(post2)

        // Проверяем, что метод update вернул true
        assertTrue(updated)
    }

    @Test
    fun updateNonExistingPostReturnsFalse() {
        // Создаем пост с несуществующим ID
        val post = Post(
            100,
            1,
            Date(),
            "Test post",
            Comments(0),
            Likes(0, 0, false),
            Reposts(0, false),
            Views(0),
            false,
            ArrayList(),
        )

        // Обновляем пост
        val updated = update(post)

        // Проверяем, что метод update вернул false
        assertFalse(updated)
    }

    @Before
    fun clearBeforeTest() {
        // Очищаем список постов перед каждым тестом
        clear()
    }
}
package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.nmedia.dto.Post

class PostRepositoryInMemory : PostRepository {

    private var nextId = 1L

    override val data: MutableLiveData<List<Post>>

    init {
        val posts = listOf(
            Post(
                id = 1,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "21 мая в 18:36",
                content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            ),
            Post(
                id = 2,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "18 сентября в 10:12",
                content = "Знаний хватит на всех: на следующей неделе разбираемся с разработкой мобильных приложений, учимся рассказывать истории и составлять PR-стратегию прямо на бесплатных занятиях \uD83D\uDC47",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            ),
            Post(
                id = 3,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "11 дек в 15:06",
                content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            ),
            Post(
                id = 4,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "31 января в 00:17",
                content = "Знаний хватит на всех: на следующей неделе разбираемся с разработкой мобильных приложений, учимся рассказывать истории и составлять PR-стратегию прямо на бесплатных занятиях \uD83D\uDC47",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            ),
            Post(
                id = 5,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "7 февраля в 21:02",
                content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            ),
            Post(
                id = 6,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "28 февраля в 04:33",
                content = "Знаний хватит на всех: на следующей неделе разбираемся с разработкой мобильных приложений, учимся рассказывать истории и составлять PR-стратегию прямо на бесплатных занятиях \uD83D\uDC47",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            ),
            Post(
                id = 7,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "13 марта в 23:09",
                content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            ),
            Post(
                id = 8,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "01 апреля в 14:19",
                content = "Знаний хватит на всех: на следующей неделе разбираемся с разработкой мобильных приложений, учимся рассказывать истории и составлять PR-стратегию прямо на бесплатных занятиях \uD83D\uDC47",
                likes = 10_000,
                likedByMe = false,
                share = 1_299_999,
                sharedByMe = false,
                views = 111_598,
                viewedByMe = false
            )
        )
        data = MutableLiveData(posts)
    }

    private val posts: List<Post>
        get() = checkNotNull(data.value) {
            "Live data should be initialized with posts"
        }

    override fun likeById(id: Long) {
        data.value = posts.map {
            if (it.id != id) it else it.copy(likedByMe = !it.likedByMe)
        }
    }

    override fun shareById(id: Long) {
        data.value = posts.map {
            if (it.id != id) it else it.copy(share = (it.share + 1))
        }
    }

    override fun removeById(id: Long) {
        data.value = posts.filterNot { it.id == id }
    }

    override fun save(post: Post) =
        if (post.id == NEW_POST_ID) insert(post) else update(post)


    private fun insert(post: Post) {
        val identifiedPost = post.copy(id = nextId++)
        data.value = listOf(identifiedPost) + posts
    }

    private fun update(post: Post) {
        data.value = posts.map {
            if (it.id == post.id) post else it
        }

    }

    private companion object {
        private const val NEW_POST_ID = 0L
    }

}
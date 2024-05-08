package com.example.articlesearch

class Dao
interface {

    interface ArticleDao {
        @Query("SELECT * FROM articles")
        fun getAllArticles(): LiveData<List<Article>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertArticles(articles: List<Article>)
    }
}
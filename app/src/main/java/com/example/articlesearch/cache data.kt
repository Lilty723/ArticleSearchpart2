package com.example.articlesearch

class ArticleRepository(private val articleDao: ArticleDao) {
    suspend fun fetchArticles(): Result<List<Article>> {
        return try {
            val articles = // Fetch articles from network
                articleDao.insertArticles(articles)
            Result.Success(articles)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}

package com.example.articlesearch

@Entity(tableName = "articles")
data class Article(
    @PrimaryKey val id: String,
    val title: String,
    val description: String,
    val mediaUrl: String
)

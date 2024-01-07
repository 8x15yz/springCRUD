package com.example.kiosk24.dto;

import com.example.kiosk24.entity.Article;

public class ArticleForm {
    private String title;
    private String content;
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}

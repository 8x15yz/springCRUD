package com.example.kiosk24.repository;

import com.example.kiosk24.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}

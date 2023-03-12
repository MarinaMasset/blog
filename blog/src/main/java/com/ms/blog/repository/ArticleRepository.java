package com.ms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.blog.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
	
}

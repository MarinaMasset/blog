package com.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
	
}

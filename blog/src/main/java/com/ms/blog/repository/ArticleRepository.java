package com.ms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.blog.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}

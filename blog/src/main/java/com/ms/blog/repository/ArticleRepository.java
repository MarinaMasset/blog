package com.ms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.blog.model.Article;

//va chercher la table Article et son contenu via sa clé primaire de type Integer
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
	
}

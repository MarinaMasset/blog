package com.ms.blog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.blog.model.Article;
import com.ms.blog.repository.ArticleRepository;

@Service
public class ArticleService {
	
	@Autowired
	ArticleRepository articleRepository;
	
//récupérer la liste d'articles 
	public List<Article> getAllArticles() {
		List<Article> articles = new ArrayList<Article>();
		articleRepository.findAll().forEach(article -> articles.add(article));
		System.out.println(articles);
		return articles;
	}
	
	
}

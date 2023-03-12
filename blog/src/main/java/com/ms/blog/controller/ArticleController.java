package com.ms.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.blog.model.Article;
import com.ms.blog.service.ArticleService;


	@RestController
public class ArticleController {

	  @Autowired
	  ArticleService articleService;
	  
	  @GetMapping("/articles")
	  private List<Article> getAllArticles() {
		  
	    return articleService.getAllArticles();
	    		
	  }

}

package com.ms.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ms.blog.model.Article;
import com.ms.blog.repository.ArticleRepository;
import com.ms.blog.repository.CommentRepository;

@SpringBootApplication
public class BlogApplication implements CommandLineRunner {
	
	@Autowired
	ArticleRepository articleRepo;
	
	@Autowired
	CommentRepository commentRepo;

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello");
		System.out.println(articleRepo.findAll());
		System.out.println(commentRepo.findAll());
	}

}

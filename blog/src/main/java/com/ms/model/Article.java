package com.ms.model;

import java.sql.Date;

import javax.persistence.*;

	@Entity
	@Table(name = "articles")
	public class Article {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		@Column(name = "title")
		private String title;

		@Column(name = "content")
		private String content;

		@Column(name = "date")
		private Date date;

		@Column(name = "type")
		private String type;
		
		@Column(name = "author")
		private String author;
		
		@Column(name = "picture")
		private String picture;
		
		public Article() {

		}
}

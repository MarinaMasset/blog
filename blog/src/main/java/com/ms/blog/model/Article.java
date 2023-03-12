package com.ms.blog.model;

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
		
//		@OneToMany(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "post_id", referencedColumnName = "id")
//	    List < Comment > comments = new ArrayList < > ();
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPicture() {
			return picture;
		}

		public void setPicture(String picture) {
			this.picture = picture;
		}
		
		public Article() {

		}
}

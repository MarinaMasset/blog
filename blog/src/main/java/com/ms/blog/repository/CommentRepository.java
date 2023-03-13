package com.ms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.blog.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}

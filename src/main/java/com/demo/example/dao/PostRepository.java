package com.demo.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

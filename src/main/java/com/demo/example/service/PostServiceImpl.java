package com.demo.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.dao.PostRepository;
import com.demo.example.model.Post;
@Service
public class PostServiceImpl implements PostService{
@Autowired
private PostRepository postRepository;

@Override
public Post savePost(Post post) {
	return postRepository.save(post);
}
}

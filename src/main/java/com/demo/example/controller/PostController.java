package com.demo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.model.Post;
import com.demo.example.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
@Autowired
private PostService postService;

@PostMapping("/save")
public ResponseEntity<Post> savePost(@RequestBody Post post) {
	Post pst=postService.savePost(post);
return ResponseEntity.ok().body(pst);
}
}
package com.rupesh.joblisting.controller;

import com.rupesh.joblisting.Model.Post;
import com.rupesh.joblisting.Repository.PostRepository;
import com.rupesh.joblisting.Repository.SearchRepository;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private SearchRepository searchRepository;

    @Hidden
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping(value = "/posts")
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @PostMapping(value = "/post")
    public Post savePost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @GetMapping(value = "/posts/{text}")
    public List<Post> search(@PathVariable String text) {
        return searchRepository.findByText(text);
    }
}

package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService
{
    private static ArrayList<Post> posts = new ArrayList<>(Arrays.asList(
            new Post((long) 0 , "post 1", new Date()),
            new Post((long) 1, "post 2", new Date()),
            new Post((long) 2, "post 3", new Date())));
    final
    PostRepository postRepository;

    public PostService(PostRepository postRepository)
    {
        this.postRepository = postRepository;
    }

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text)
    {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}


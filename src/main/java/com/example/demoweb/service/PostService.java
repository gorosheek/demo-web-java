package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService
{
    public List<Post> listAllPosts()
    {
        return Arrays.asList(new Post("post 1", new Date()),
                new Post("post 2", new Date()),
                new Post("post 3", new Date()));
    }
}


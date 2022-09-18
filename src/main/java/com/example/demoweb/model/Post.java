package com.example.demoweb.model;

import java.util.Date;

public class Post
{
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(Long id, String text, Date creationDate)
    {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        likes = 0;
    }

    public void setLikes(Integer like)
    {
        this.likes = like;
    }

    public Long getId()
    {
        return id;
    }

    public String getText()
    {
        return text;
    }

    public Integer getLikes()
    {
        return likes;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }
}

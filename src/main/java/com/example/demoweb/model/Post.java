package com.example.demoweb.model;

import java.util.Date;

public class Post
{
    private Long id;
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(Long id, String text, Date creationDate)
    {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }
    public void setLikes(Integer like){
        this.likes = likes;
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

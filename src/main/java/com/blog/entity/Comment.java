package com.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="comments")
public class Comment {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String content;
    @ManyToOne
    private Post post;
}


package com.codecool.bonusoopexcercise;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Topic extends Entry {

    private String title;
    private List<Comment> comments = new ArrayList<>();


    public Topic(Date creationDate, String message, int id, String title) {
        super(creationDate, message, id);
        this.title = title;
    }


    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public List<Comment> getModeratedComments() {
        return this.comments.stream().filter(Comment::isModerated).collect(Collectors.toList());
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "title='" + title + '\'' +
                ", comments=" + comments +
                ", creationDate=" + creationDate +
                ", message='" + message + '\'' +
                ", id=" + id +
                '}';
    }
}

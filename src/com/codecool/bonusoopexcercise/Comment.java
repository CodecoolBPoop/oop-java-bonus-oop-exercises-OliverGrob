package com.codecool.bonusoopexcercise;

import java.util.Date;

public class Comment extends Entry {

    private boolean moderated = false;


    public Comment(Date creationDate, String message, int id) {
        super(creationDate, message, id);
    }


    public void toggleModeration() {
        this.moderated = !this.moderated;
    }

    public boolean isModerated() {
        return moderated;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "moderated=" + moderated +
                ", creationDate=" + creationDate +
                ", message='" + message + '\'' +
                ", id=" + id +
                '}';
    }
}

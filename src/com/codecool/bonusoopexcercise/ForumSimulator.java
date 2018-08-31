package com.codecool.bonusoopexcercise;

import java.util.Date;

public class ForumSimulator {

    public static void main(String[] args) {

        Topic first = new Topic(new Date(), "Jó lesz!", 1, "Kezdet");
        Comment comment = new Comment(new Date(), "Kaksi mukszik", 1);
        first.addComment(comment);
        System.out.println(first.toString());
        System.out.println(first.getModeratedComments().size());
        comment.toggleModeration();
        System.out.println(first.getModeratedComments().size());
        Forum.addTopic(first);
        System.out.println(Forum.getInstance().toString());
    }

}

package com.codecool.bonusoopexcercise;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private static Forum instance = null;
    private static List<Topic> topics = new ArrayList<>();


    private Forum() {
    }


    public static Forum getInstance() {
        if (instance == null) {
            return new Forum();
        }
        return instance;
    }

    public static void addTopic(Topic topic) {
        topics.add(topic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getClass().getSimpleName()).append("{");
        for (Topic topic : topics) {
            sb.append("Topic title: ").append(topic.getTitle()).append(", Topic message: ").append(topic.getMessage()).append("; ");
        }
        sb.append("}");

        return sb.toString();
    }
}

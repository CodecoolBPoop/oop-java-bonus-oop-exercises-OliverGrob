package com.codecool.bonusoopexcercise;

import java.util.Date;

public abstract class Entry {

    protected Date creationDate;
    protected String message;
    protected int id;


    public Entry(Date creationDate, String message, int id) {
        this.creationDate = creationDate;
        this.message = message;
        this.id = id;
    }


    public String getMessage() {
        return message;
    }

}

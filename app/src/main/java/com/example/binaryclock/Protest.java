package com.example.binaryclock;

public class Protest {
    public String title;
    public String location;
    public String time;

    public Protest(String title, String location, String time) {
        this.title = title;
        this.location = location;
        this.time = time;
    }
    public Protest() {

    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }
}

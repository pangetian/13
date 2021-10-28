package com.clock.entity;

public class Activity {
    private int activity_id;
    private String title;
    private String start_time;
    private String end_datetime;
    private String pos_name;
    private String pos_latitude;
    private String pos_longtitude;
    private String qr_code;
    private String password;
    private String distance;
    private String open_id;

//    public Activity(int activity_id, String title, String start_time, String end_datetime, String pos_name, String pos_latitude, String pos_longtitude, String qr_code, String password, String distance, String open_id) {
//        this.activity_id = activity_id;
//        this.title = title;
//        this.start_time = start_time;
//        this.end_datetime = end_datetime;
//        this.pos_name = pos_name;
//        this.pos_latitude = pos_latitude;
//        this.pos_longtitude = pos_longtitude;
//        this.qr_code = qr_code;
//        this.password = password;
//        this.distance = distance;
//        this.open_id = open_id;
//    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_datetime() {
        return end_datetime;
    }

    public void setEnd_datetime(String end_datetime) {
        this.end_datetime = end_datetime;
    }

    public String getPos_name() {
        return pos_name;
    }

    public void setPos_name(String pos_name) {
        this.pos_name = pos_name;
    }

    public String getPos_latitude() {
        return pos_latitude;
    }

    public void setPos_latitude(String pos_latitude) {
        this.pos_latitude = pos_latitude;
    }

    public String getPos_longtitude() {
        return pos_longtitude;
    }

    public void setPos_longtitude(String pos_longtitude) {
        this.pos_longtitude = pos_longtitude;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }
}

package com.everis.curso.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OnemiDTO {

    private int state;
    private String url;
    private String post_title;
    private String alert_region;
    private String alert_date; // FORMATO DD/MM/YYYY | hh:mi

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getAlert_region() {
        return alert_region;
    }

    public void setAlert_region(String alert_region) {
        this.alert_region = alert_region;
    }

    public String getAlert_date() {
        return alert_date;
    }

    public void setAlert_date(String alert_date) {
        this.alert_date = alert_date;
    }
}

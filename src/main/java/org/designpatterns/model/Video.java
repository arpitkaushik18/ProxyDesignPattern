package org.designpatterns.model;

public class Video {

    String videoId;
    String title;
    String data;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Video(String videoId, String title) {
        this.videoId = videoId;
        this.title = title;
        this.data = "random video";
    }
}

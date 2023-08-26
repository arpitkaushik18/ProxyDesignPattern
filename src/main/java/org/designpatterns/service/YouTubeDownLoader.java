package org.designpatterns.service;

import org.designpatterns.model.Video;

import java.util.HashMap;

public class YouTubeDownLoader {

    private ThirdPartyYTLib ytLib;

    public YouTubeDownLoader(ThirdPartyYTLib ytLib) {
        this.ytLib = ytLib;
    }

    public void renderVideoPage(String videoId) {
        Video video = ytLib.getVideoById(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getVideoId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = ytLib.getRandomVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.getVideoId() + " / Title: " + video.getTitle());
        }
        System.out.println("-------------------------------\n");
    }
}

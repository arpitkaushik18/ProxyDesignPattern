package org.designpatterns.service;

import org.designpatterns.model.Video;

import java.util.HashMap;

public class ThirdPartyYTLibWithProxy implements ThirdPartyYTLib{

    HashMap<String,Video> cacheAll;
    HashMap<String,Video> cacheRandomVideo;

    ThirdPartyYTLib youtubeservice;

    public ThirdPartyYTLibWithProxy() {
        this.cacheAll = new HashMap<String, Video>();
        this.cacheRandomVideo = new HashMap<String, Video>();
        this.youtubeservice = new ThirdPartyYTLibImpl();
    }

    public HashMap<String, Video> getRandomVideos() {
       if(cacheAll.isEmpty()){
           cacheAll = youtubeservice.getRandomVideos();
       }else {
           System.out.println("Retrieved list from cache.");
       }
       return cacheAll;
    }

    public Video getVideoById(String videoId) {
        if(!cacheRandomVideo.containsKey(videoId)){
            Video video = youtubeservice.getVideoById(videoId);
            cacheRandomVideo.put(videoId,video);
        }else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return cacheRandomVideo.get(videoId);
    }
}

package org.designpatterns.service;

import org.designpatterns.model.Video;

import java.util.HashMap;

public interface ThirdPartyYTLib {

    public HashMap<String, Video> getRandomVideos();
    public Video getVideoById(String videoId);
}

package org.designpatterns.service;

import org.designpatterns.model.Video;

import java.util.HashMap;

public class ThirdPartyYTLibImpl implements ThirdPartyYTLib{

    HashMap<String,Video> videosData;
    public HashMap<String, Video> getRandomVideos() {
        connectingToServer();
        return getVideos();
    }

    private HashMap<String, Video> getVideos() {
        System.out.print("Downloading populars... ");

        networkDelay();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private void connectingToServer() {

        System.out.println("We're connecting to server..");
        networkDelay();
        System.out.println("Successfully Connected");

    }

    private void networkDelay() {
        Integer latencyDelay = getRandom(5,10);
        for(int i = 0 ; i < latencyDelay; i++){
            try {
                Thread.sleep(100);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    private Integer getRandom(int min, int max) {
        return min + (int)Math.random()*((max-min) + 1);
    }

    public Video getVideoById(String videoId) {
        System.out.println("downloading some video");
        networkDelay();
        Video video = new Video("APK","ZNMD.mp4");
        System.out.print("Done!" + "\n");
        return video;
    }
}

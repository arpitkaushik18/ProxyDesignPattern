package org.designpatterns;

import org.designpatterns.service.ThirdPartyYTLibImpl;
import org.designpatterns.service.ThirdPartyYTLibWithProxy;
import org.designpatterns.service.YouTubeDownLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        YouTubeDownLoader naiveDownloader = new YouTubeDownLoader(new ThirdPartyYTLibImpl());
        YouTubeDownLoader smartDownloader = new YouTubeDownLoader(new ThirdPartyYTLibWithProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YouTubeDownLoader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}

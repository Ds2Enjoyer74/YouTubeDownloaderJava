package ru.rusguardian;

import com.github.axet.vget.VGet;

import java.io.File;
import java.net.URL;
import com.github.axet.vget.VGet;
import java.io.File;
import java.net.URL;

public class YouTubeDownloader {
    public static void downloadVideo(String videoUrl, String outputDirectory) {
        try{
            File outputDir = new File(outputDirectory);
            if(!outputDir.exists()) {
                outputDir.mkdirs();
            }
            VGet v = new VGet(new URL(videoUrl), outputDir);
            v.download();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

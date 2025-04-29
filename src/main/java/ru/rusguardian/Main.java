package ru.rusguardian;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import static ru.rusguardian.YouTubeDownloader.downloadVideo;

public class Main {
    public static void main(String[] args) {
        String videoUrl = "https://youtu.be/bk5MD6W7SwM?si=uVzTYzBN0ohnlFBE";
        String outputDir = "downloads";
        downloadVideo(videoUrl, outputDir);
    }
}
package designPattern.adapter.mediaplayer;

public interface Media {

    String fileName = ".mp3";
    void play(String audioType, String fileName);
}

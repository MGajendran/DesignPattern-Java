package designPattern.adapter.advancedmediaplayer;

public interface AdvancedMedia {
    String fileName = ".mp4";
    void loadFileName(String fileName);
    void listen();
}

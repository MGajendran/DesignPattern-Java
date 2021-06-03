package designPattern.adapter.mediaplayer;

public class MediaPlayer implements Media{
    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase(""))
            audioType = Media.fileName;

        System.out.println("Playing " + fileName + audioType);
    }
}

package designPattern.adapter.advancedmediaplayer;

public class AdvancedMediaPlayer implements AdvancedMedia{

    private String fileName = "";

    @Override
    public void loadFileName(String fileNameWithFormat) {
        if(!fileNameWithFormat.contains("."))
            fileNameWithFormat += AdvancedMedia.fileName;
        System.out.println("Loading file ");
        fileName = fileNameWithFormat;
    }

    @Override
    public void listen() {
        System.out.println("Listening to " + fileName);
    }
}

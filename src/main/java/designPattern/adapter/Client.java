package designPattern.adapter;

import designPattern.adapter.adapterMedia.MediaAdapter;
import designPattern.adapter.advancedmediaplayer.AdvancedMedia;
import designPattern.adapter.advancedmediaplayer.AdvancedMediaPlayer;

public class Client {

    public static void main(String[] args) {

        AdvancedMedia am = new AdvancedMediaPlayer();

        MediaAdapter objMediaAdapter = new MediaAdapter(am);
        objMediaAdapter.play(".mp3", "Believer");

    }


}

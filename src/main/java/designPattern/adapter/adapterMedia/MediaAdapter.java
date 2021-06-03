package designPattern.adapter.adapterMedia;

import designPattern.adapter.advancedmediaplayer.AdvancedMedia;
import designPattern.adapter.mediaplayer.Media;

public class MediaAdapter implements Media {

    /*
        Now their is requirement from the client that the old formats should not supported
        and everything should be played only via advanced Media only.

        But as service providers we cannot immediately stop the users who still uses old media players.

        so this where this Adapter pattern plays a role in converting the old one to new format.

     */


    private AdvancedMedia am;

    public MediaAdapter(AdvancedMedia am){
        this.am = am;
    }

    @Override
    public void play(String audioType, String fileName) {

        am.loadFileName(fileName + audioType);
        am.listen();

    }

}

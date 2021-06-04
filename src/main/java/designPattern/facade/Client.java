package designPattern.facade;

import designPattern.facade.facade.Facade;
import designPattern.facade.movie.*;

public class Client {


    public static void main(String[] args) {

        Facade objFacade = new Facade(new Movie(), new Lights(), new PopCorn(), new Projector(), new Speakers());
        objFacade.setUpMovie();
        System.out.println("---------------------------------------------------------------------------------");
        objFacade.turnOffMovie();
    }


}

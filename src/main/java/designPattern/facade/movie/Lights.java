package designPattern.facade.movie;

public class Lights {

    public void setToMovieMode(){
        System.out.println("Lights turned down to 10%");
    }

    public void backToNormalMode(){
        System.out.println("Lights resumed to 100%");
    }

}

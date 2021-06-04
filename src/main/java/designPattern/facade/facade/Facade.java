package designPattern.facade.facade;

import designPattern.facade.movie.*;

public class Facade {
    /*
        Facade pattern is used to connect the interfaces to reduce the complexity, The main purpose of this
        pattern is to loosely couple things and provide simple interface so that the client doesn't understand
        the back ground complexity.
     */
    private Movie movie;
    private Lights light;
    private PopCorn pop;
    private Projector proj;
    private Speakers speakers;

    public Facade (Movie movie, Lights light, PopCorn pop, Projector proj, Speakers speakers){
       this.movie = movie;
       this.speakers = speakers;
       this.pop= pop;
       this.proj = proj;
       this.light = light;
    }

    public void setUpMovie() {

        pop.prepare();
        speakers.on();
        proj.on();
        light.setToMovieMode();
        movie.movieOn();


    }

    public void turnOffMovie() {

        movie.MovieOff();
        proj.off();
        speakers.off();
        light.backToNormalMode();
    }

}

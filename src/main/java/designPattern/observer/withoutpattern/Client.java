package designPattern.observer.withoutpattern;

public class Client {
    /*
     * This example is about the whether station giving its update to the users.
     * The other examples are cricket app, feed app something with channel publish.
     */

    public static void main(String[] args) {
        Subject objSub = new Subject(5, 10);
        Subject.notifyUsers(objSub);

    }
}

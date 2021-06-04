package designPattern.proxy;

import designPattern.proxy.subject.ISubject;
import designPattern.proxy.subject.LibraryProxy;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ArrayList restrictedSite = new ArrayList<String>();

        restrictedSite.add("https://fb.com");
        restrictedSite.add("https://instagram.com");

        LibraryProxy sub = new LibraryProxy(restrictedSite);
        sub.setHostUrl("https://fb.com");
        sub.access();
        System.out.println();

        sub.setHostUrl("https://youtube.com");
        sub.access();
        System.out.println();

        sub.setHostUrl("https://stackoverflow.com");
        sub.access();
        System.out.println();

        sub.setHostUrl("https://instagram.com");
        sub.access();
        System.out.println();


    }


}

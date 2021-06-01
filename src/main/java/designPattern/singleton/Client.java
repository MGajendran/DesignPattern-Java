package designPattern.singleton;

import designPattern.singleton.nonthreadsafe.Singleton;

public class Client {

    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();

        if(obj.equals(obj1)){
            System.out.println("Both obj and obj1 are same");
        }
    }
}

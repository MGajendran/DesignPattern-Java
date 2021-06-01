package designPattern.singleton.threadsafe;


public class ThreadSafeSingleton {

    private static ThreadSafeSingleton obj = null;

    private ThreadSafeSingleton(){

    }

    public synchronized static ThreadSafeSingleton getInstance () {
        if(obj == null){
            obj = new ThreadSafeSingleton();
        }
        return obj;
    }
}

package designPattern.command.invoker;

import designPattern.command.receiver.IReceiver;
import designPattern.command.receiver.MacFileSystem;
import designPattern.command.receiver.WindowsFileSystem;

public class FileEnvironment {

    private static IReceiver objIreceiver;

    public static IReceiver getFileEnvironment () {

        String os = System.getProperty("os.name");
        System.out.println("os.name " + os);
        if(os.contains("null")){
            objIreceiver = new WindowsFileSystem();
        } else {
            objIreceiver = new MacFileSystem();
        }

        return objIreceiver;
    }
}

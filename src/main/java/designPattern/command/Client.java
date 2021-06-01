package designPattern.command;

import designPattern.command.command.*;
import designPattern.command.invoker.FileEnvironment;
import designPattern.command.invoker.FileInvoker;
import designPattern.command.receiver.IReceiver;

public class Client {

    public static void main(String[] args) {

        FileInvoker objFileInvoker = null;

        IReceiver obj = FileEnvironment.getFileEnvironment();

        OpenFileCommand open = new OpenFileCommand(obj);

        objFileInvoker = new FileInvoker(open);
        objFileInvoker.execute();

        objFileInvoker = new FileInvoker(new WriteFileCommand(obj));
        objFileInvoker.execute();

        objFileInvoker = new FileInvoker(new CloseFileCommand(obj));
        objFileInvoker.execute();


    }
}

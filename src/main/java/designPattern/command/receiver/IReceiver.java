package designPattern.command.receiver;

public interface IReceiver {

    /*
        This is the receiver interface for the file system now the windows, mac or different platforms should
        their own logic in their implementation class.
     */
    void openFile();
    void closeFile();
    void writeFile();

}

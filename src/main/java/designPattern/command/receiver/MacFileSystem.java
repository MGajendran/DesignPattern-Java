package designPattern.command.receiver;

public class MacFileSystem implements IReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in the MAC....");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in the MAC....");
    }

    @Override
    public void writeFile() {
        System.out.println("MAC writing file is called...");
    }
}

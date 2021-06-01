package designPattern.command.receiver;

public class WindowsFileSystem implements IReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in the Windows....");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in the Windows....");
    }

    @Override
    public void writeFile() {
        System.out.println("Windows writing file is called...");
    }
}

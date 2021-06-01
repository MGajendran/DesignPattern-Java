package designPattern.command.command;

import designPattern.command.receiver.IReceiver;

public class OpenFileCommand implements ICommand{

    IReceiver objIReceiver;

    public OpenFileCommand( IReceiver objIReceiver){
        this.objIReceiver = objIReceiver;
    }

    @Override
    public void execute() {
        objIReceiver.openFile();
    }
}

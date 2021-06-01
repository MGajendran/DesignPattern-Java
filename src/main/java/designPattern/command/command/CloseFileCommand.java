package designPattern.command.command;

import designPattern.command.receiver.IReceiver;

public class CloseFileCommand implements ICommand{

    IReceiver objIReceiver;

    public CloseFileCommand(IReceiver objIReceiver){
        this.objIReceiver = objIReceiver;
    }

    @Override
    public void execute() {
        objIReceiver.closeFile();
    }
}

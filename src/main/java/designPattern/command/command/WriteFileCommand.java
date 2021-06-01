package designPattern.command.command;

import designPattern.command.receiver.IReceiver;

public class WriteFileCommand implements ICommand{

    IReceiver objIreceiver;

    public WriteFileCommand(IReceiver objIreceiver){
        this.objIreceiver = objIreceiver;
    }

    @Override
    public void execute() {
        objIreceiver.writeFile();
    }
}

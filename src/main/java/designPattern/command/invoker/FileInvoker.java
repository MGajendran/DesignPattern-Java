package designPattern.command.invoker;

import designPattern.command.command.ICommand;

public class FileInvoker {

    public ICommand objICommand;

    public FileInvoker(ICommand objICommand){
        this.objICommand = objICommand;
    }

    public void execute() {
        objICommand.execute();
    }

}

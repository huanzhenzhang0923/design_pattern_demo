package model;

import interfaces.Command;

public class GameBoy {
    private Command UpCommand, DownCommand,leftCommand,rightCommand;

    public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
        UpCommand = upCommand;
        DownCommand = downCommand;
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
    }

    public void arrowUp(){
        UpCommand.execute();
    }

    public void arrowDown(){
        DownCommand.execute();
    }

    public void arrowRight(){
        rightCommand.execute();
    }

    public void arrowLeft(){
        leftCommand.execute();
    }
}

package model;

import interfaces.Command;

public class MarioRightCommand implements Command {
    private MarioCharacterReciever marioCharacterReciever;

    public MarioRightCommand(MarioCharacterReciever marioCharacterReciever) {
        this.marioCharacterReciever = marioCharacterReciever;
    }

    @Override
    public void execute() {
        marioCharacterReciever.moveRight();
    }
}

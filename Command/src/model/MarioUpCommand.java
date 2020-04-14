package model;

import interfaces.Command;

public class MarioUpCommand implements Command {
    private MarioCharacterReciever marioCharacterReciever;

    public MarioUpCommand(MarioCharacterReciever marioCharacterReciever) {
        this.marioCharacterReciever = marioCharacterReciever;
    }

    @Override
    public void execute() {
        marioCharacterReciever.moveUp();
    }
}

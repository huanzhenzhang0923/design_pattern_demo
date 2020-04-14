package model;

public class MainClass {
    public static void main(String[] args) {
        MarioCharacterReciever mario=new MarioCharacterReciever();
        mario.setName("Mario");
        MarioUpCommand marioUpCommand=new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand=new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand=new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand=new MarioRightCommand(mario);
        GameBoy gameBoy=new GameBoy(marioUpCommand,marioDownCommand,marioLeftCommand,marioRightCommand);
        gameBoy.arrowDown();

    }
}

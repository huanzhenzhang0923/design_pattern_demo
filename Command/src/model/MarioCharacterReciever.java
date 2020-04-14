package model;

public class MarioCharacterReciever {
    private String name;
    public void moveUp(){
        System.out.println(getName()+"Moving Up");
    }
    public void moveLeft(){
        System.out.println(getName()+"Moving left");
    }

    public void moveDown(){
        System.out.println(getName()+"Moving Down");
    }

    public void moveRight(){
        System.out.println(getName()+"Moving Right");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

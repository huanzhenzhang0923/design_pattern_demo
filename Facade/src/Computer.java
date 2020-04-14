

public class Computer {
    private final   CPU processor=new CPU();
    private final Memory ram=new Memory();
    private final HardDrive hd=new HardDrive();

    public Computer() {
    }

    public void start(){
        processor.freeze();
        ram.load(1234,hd.read(3245,89));
        processor.jump(1234);
        processor.execute();
    }
}

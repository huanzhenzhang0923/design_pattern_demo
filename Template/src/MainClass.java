public class MainClass {
    public static void main(String[] args) {
        Game game=new FootBallGame();
        game.play();
        System.out.println("========");
        Game game2=new EndlessRunnerGame();
        game2.play();
    }
}

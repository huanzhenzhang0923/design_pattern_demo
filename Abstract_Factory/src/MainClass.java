public class MainClass {
    public static void main(String[] args) {
        PythonCourseFactory factory=new PythonCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}

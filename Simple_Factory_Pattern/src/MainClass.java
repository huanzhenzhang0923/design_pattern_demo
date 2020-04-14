public class MainClass {
    public static void main(String[] args) {
        CourseFactory factory=new CourseFactory();
//        ICourse course=factory.create("java");
        ICourse course=factory.create(PythonCourse.class);
        course.record();
    }
}

public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if(null!= clazz){
                return clazz.newInstance();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
//        if("java".equals(name)){
//            return new JavaCourse();
//        }
//        else if("python".equals(name)){
//            return new PythonCourse();
//        }
//        return null;
    }
}

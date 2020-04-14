public class MainClass {
    public static void main(String[] args) {
        Person Bob=new Person("Bobson",21);
        System.out.println(Bob);
        Person nina=(Person) Bob.clone();
        nina.setAge(13);
        nina.setName("niana");
        System.out.println(nina);

    }


}

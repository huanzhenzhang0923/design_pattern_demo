import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        User james=new User.UserBuilder("James","Board").age(14).address("56 West Street").phoneNumber("50866692301").build();
        System.out.println(james);

        int[] a=new int[]{1,2,3,4,5};
        int[] b=a.clone();
        b[2]=100;
    }
}

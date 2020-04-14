public class User {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final String phoneNumber;
    private final String address;

    public User(UserBuilder builder){
        this.firstname=builder.firstname;
        this.lastname=builder.lastname;
        this.address=builder.address;
        this.age=builder.age;
        this.phoneNumber=builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: "+
                "firstname='" + firstname  +" lastname='" + lastname + "\n" +
                "Age=" + age + "\n" +
                "PhoneNumber=" + phoneNumber + "\n" +
                "Address='" + address +"\n"; }

    public static class UserBuilder{
        private final String firstname;
        private final String lastname;
        private int age;
        private String phoneNumber;
        private String address;

        public UserBuilder(String firstname,String lastname){
            this.firstname=firstname;
            this.lastname=lastname;
        }

        public UserBuilder age(int age){
            this.age=age;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }

        public UserBuilder address(String address){
            this.address=address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}

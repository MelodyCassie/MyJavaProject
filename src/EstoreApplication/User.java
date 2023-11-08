package EstoreApplication;

import java.util.List;

public class User {

    private List<User> users;

    private int age;
    private String email;
    private HomeAddress homeAddress;

    private String name;
    private String password;

    private String phoneNumber;

    public User(int age, String email, HomeAddress homeAddress, String name, String password, String phoneNumber){
        this.age = age;
        this.email = email;
        this.homeAddress = homeAddress;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }




}

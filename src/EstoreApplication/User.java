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
    private UserType userType;

    public User(int age, String email, HomeAddress homeAddress, String name, String password, String phoneNumber, UserType userType){
        this.age = age;
        this.email = email;
        this.homeAddress = homeAddress;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

//my reminder to put Getters and setters for userId, username, userType,

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setUserType(UserType userType){
        this.userType = userType;
    }
    public UserType userType(){
        return  userType;
    }



// billingInformations, and homeAddress


}

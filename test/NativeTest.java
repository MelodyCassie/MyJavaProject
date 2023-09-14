import tdd.Native;

public class NativeTest {
    public static void main(String[] args) {

        Native explorers = new Native();

        explorers.setName("explore");
        String name = explorers.getName();
        System.out.println(name);

        explorers.setIdNumber("8888");
        String number = explorers.getIdNumber();
        System.out.println(number);

        explorers.setEmail("aw@aw");
        String email = explorers.getEmail();
        System.out.println(email);



    }

}

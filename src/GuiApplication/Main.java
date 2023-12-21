package GuiApplication;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null,"Hello! "+ name );

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
        JOptionPane.showMessageDialog(null, "you are "+ age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height? "));
        JOptionPane.showMessageDialog(null, "Your height is "+ height+ " and you are of age "+ age+".");

    }

}

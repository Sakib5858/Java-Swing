import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String str = JOptionPane.showInputDialog(null,"Enter your first name","Collect",JOptionPane.QUESTION_MESSAGE);

        String str1 = JOptionPane.showInputDialog(null,"Last name","Input 2",1);

        String fs = str + " " + str1;

        JOptionPane.showMessageDialog(null,fs+" Welcome","Details",2);
    }
}
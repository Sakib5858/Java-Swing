import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        String str = JOptionPane.showInputDialog(null,"Enter your first name","Collect",JOptionPane.QUESTION_MESSAGE);
//
//        String str1 = JOptionPane.showInputDialog(null,"Last name","Input 2",1);
//
//        String fs = str + " " + str1;
//
//        JOptionPane.showMessageDialog(null,fs+" Welcome","Details",2);

        //-------------------------------------------------------------------------------

//        int choice = JOptionPane.showConfirmDialog(null,"Do you want to confirm ?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
//
//        if(choice == JOptionPane.YES_OPTION)
//            System.out.println("Confirmed !!!!!");
//        else if(choice == JOptionPane.NO_OPTION)
//            System.out.println("You cancled this");
//        else System.exit(0);

        //---------------------------------------------------------------------------------------------

        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setSize(500,300);
        //jf.setLocationRelativeTo(null);
        //jf.setLocation(500,300);
        jf.setBounds(500,300,500,250);
        jf.setTitle("Frame Demos");
        jf.setResizable(false); //we cant change it size(can't be maximize)


    }
}
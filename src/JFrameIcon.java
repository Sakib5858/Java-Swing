import javax.swing.*;
import java.awt.*;

public class JFrameIcon extends JFrame{

    private ImageIcon im;
    private Container c;
    private JLabel jl;
    public JFrameIcon(){

        im = new ImageIcon(getClass().getResource("gub logo.png"));
        this.setIconImage(im.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);

        jl = new JLabel();
        jl.setBounds(100,1,500,350);
        jl.setText("Enter your name: ");
        c.add(jl);


    }

    public static void main(String[] args) {

        JFrameIcon jf = new JFrameIcon();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,300,500,250);
        jf.setTitle("Green University");

    }
}

import javax.swing.*;
import java.awt.*;

public class JFrameIcon extends JFrame{

    private ImageIcon im;
    private Container c;
    public JFrameIcon(){
        im = new ImageIcon(getClass().getResource("gub logo.png"));
        this.setIconImage(im.getImage());
        c = this.getContentPane();
        c.setBackground(Color.lightGray);
    }

    public static void main(String[] args) {

        JFrameIcon jf = new JFrameIcon();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,300,500,250);


    }
}

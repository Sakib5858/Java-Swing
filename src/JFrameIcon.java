import javax.swing.*;
import java.awt.*;

public class JFrameIcon extends JFrame{

    ImageIcon im;
    public JFrameIcon(){
        im = new ImageIcon(getClass().getResource("gub logo.png"));
        this.setIconImage(im.getImage());
    }

    public static void main(String[] args) {

        JFrameIcon jf = new JFrameIcon();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,300,500,250);


    }
}

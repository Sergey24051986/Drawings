import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RocketGo extends JPanel {
    BufferedImage img;
    static int n = -200,m = -200;
    public RocketGo() throws IOException{
        img = ImageIO.read(new File("Rocket.png"));
        n+=3; m+=3;
        if(n > 800 & m > 800) {
            n = -200;
            m = -200;
        }
    }
    public void paint(Graphics g) {
        g.drawImage(img,n,m,null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rocket");
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.add(new RocketGo());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                frame.setVisible(true);
            }
        };
        Timer myTimer = new Timer(1, action);
        myTimer.start();
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class OvalInSquare extends Component{
    static int n = 0, m = 0;
    BufferedImage img;

    public OvalInSquare() throws IOException {
        img = ImageIO.read(new File("Oval.png"));
        if(m < 1) n+=3;
        if(n >= 681) m += 3;
        if(m > 659) n -= 3;
        if(n < 1) m -= 3;
    }

    public static void ovalImage() throws IOException {
        BufferedImage oval = new BufferedImage(110,110,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = oval.createGraphics();
        g.setBackground(Color.white);
        g.clearRect(0,0,150,150);
        // Улучшение текстур
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Рисование
        g.setColor(Color.ORANGE);
        g.fillOval(0, 0, 100, 100);
        g.setColor(Color.black);
        g.drawOval(0, 0, 100, 100);
        ImageIO.write(oval,"png", new File("Oval.png"));
    }
    public void paint(Graphics g) {g.drawImage(img,n,m,null);}

    public static void main(String[] args) throws IOException {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,800);
        OvalInSquare.ovalImage();
        f.getContentPane().setBackground(Color.white);
        f.setVisible(true);
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    f.add(new OvalInSquare());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                f.setVisible(true);
            }

        };
        Timer timer = new Timer(1,action);
        timer.start();

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;

public class DirectLine extends Component {

    private BufferedImage img;
    private static JFrame f;
    private static int x = -200,  y = -200;
    private final static int speedX = 6, speedY = 6;
    private static double widthCurrent, heightCurrent; // Текущие ширина, высота окна

    public DirectLine() {
        paintRocket();
        x += speedX;
        y += speedY;

        if(x > widthCurrent | y > heightCurrent) {
            x = -200;
            y = -200;
        }
    }
    public void paint(Graphics g) {
        var g2D = (Graphics2D) g;
        g2D.drawImage(img, x, y, 250, 250, null);
    }

    public static void main(String[] args) {
        f = new JFrame("Rocket");
        f.getContentPane().setBackground(Color.black);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,800);
        f.add(new DirectLine());
        f.setVisible(true);

        ActionListener action = e -> {
            f.add(new DirectLine());
            f.setVisible(true);
        };
        Timer myTimer = new Timer(1, action);
        myTimer.start();

        f.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                heightCurrent = f.getSize().getHeight();
                widthCurrent = f.getSize().getWidth();
                x = 0; y = 0;
            }
        });
    }

    public void paintRocket() {
        img = new BufferedImage(500,500,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2D = img.createGraphics();
        g2D.setBackground(Color.black); // Цвет фона
        g2D.clearRect(0,0,500,500);// Без очистки не поменяется фон!
        // Вращение
        g2D.rotate(2.3,335,220);
        // Сглаживание
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        // Рисование
        // Закрашивание корпуса
        g2D.setColor(Color.white);
        g2D.fillArc(300,0,300,400,109,120);
        g2D.fillArc(201,0,300,400,311,120);
        // Верхушка
        g2D.setColor(Color.red);
        g2D.setStroke(new BasicStroke(2));
        g2D.fill(new QuadCurve2D.Double(319,100,340,45,400,10));
        g2D.fill(new QuadCurve2D.Double(481,100,460,45,400,10));
        g2D.fillPolygon(new int[]{319,400,481}, new int[]{100,10,100}, 3);
        // Левое крыло
        g2D.setColor(Color.red);
        g2D.fill(new QuadCurve2D.Double(311,275,259,275,270,425));
        g2D.fillPolygon(new int[]{311,330,296}, new int[]{275,320,327}, 3);
        g2D.setColor(Color.black);
        g2D.fill(new QuadCurve2D.Double(330,320,280,300,270,425));
        g2D.setColor(Color.black);
        g2D.draw(new QuadCurve2D.Double(311,275,259,275,270,425));
        g2D.draw(new QuadCurve2D.Double(330,320,280,300,270,425));
        // Правое крыло
        g2D.setColor(Color.red);
        g2D.fill(new QuadCurve2D.Double(489,275,541,275,530,425));
        g2D.fillPolygon(new int[]{489,470,504}, new int[]{275,320,327}, 3);
        g2D.setColor(Color.black);
        g2D.fill(new QuadCurve2D.Double(470,320,520,300,530,425));
        g2D.setColor(Color.black);
        g2D.draw(new QuadCurve2D.Double(489,275,541,275,530,425));
        g2D.draw(new QuadCurve2D.Double(470,320,520,300,530,425));
        // Нижняя часть
        g2D.setColor(Color.GRAY);
        g2D.fill(new QuadCurve2D.Double(318,297,332,330,351,350));
        g2D.fill(new QuadCurve2D.Double(481,297,468,330,448,350));
        g2D.fillPolygon(new int[]{318,482,449,351}, new int[]{297,297,350,350}, 4);
        // Огонь
        g2D.setColor(Color.orange);
        g2D.fill(new QuadCurve2D.Double(351,350,350,450,400,600));
        g2D.fill(new QuadCurve2D.Double(448,350,450,450,400,600));
        g2D.fillPolygon(new int[]{350,449,400}, new int[]{350,350,601}, 3);
        g2D.setColor(Color.YELLOW);
        g2D.fill(new QuadCurve2D.Double(371,350,370,450,400,500));
        g2D.fill(new QuadCurve2D.Double(428,350,430,450,400,500));
        g2D.fillPolygon(new int[]{371,428,400}, new int[]{350,350,500}, 3);
        // Корпус
        g2D.setColor(Color.black);
        g2D.drawArc(300,0,300,400,109,120); // левая сторона корпуса
        g2D.drawArc(201,0,300,400,311,120); // правая сторона корпуса
        g2D.drawLine(319,100,481,100); // верхняя линия
        g2D.drawLine(318,297,481,297); // средняя линия
        g2D.drawLine(351,350,448,350); // нижняя линия
        // Иллюминатор
        g2D.setColor(Color.GRAY);
        g2D.fillOval(350,150,100,100);
        g2D.setColor(Color.CYAN);
        g2D.fillOval(365,165,70,70);
        g2D.setColor(Color.black);
        g2D.drawOval(350,150,100,100);
        g2D.drawOval(365,165,70,70);
        // Центральное крыло
        g2D.setStroke(new BasicStroke(5));
        g2D.drawRect(390,275,20,150);
        g2D.setColor(Color.red);
        g2D.fillRect(390,275,20,150);
        g2D.dispose();
    }
}

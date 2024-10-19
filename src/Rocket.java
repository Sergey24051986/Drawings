import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Rocket extends Canvas{
    public Rocket() throws IOException {
        //Конструктор для записи в файл
        BufferedImage rocketImage = new BufferedImage(500,500,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = rocketImage.createGraphics();
        painting(g);
        // Уменьшение масштаба изображения
        BufferedImage img = new BufferedImage(250,250,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.drawImage(rocketImage,0,0,250,250,null);
        g2.dispose();
        //Запись в файл
        ImageIO.write(img,"png",new File("Rocket.png"));
    }
    public void paint(Graphics g0) {
        Graphics2D g = (Graphics2D) g0;
        painting(g);
    }
    public void painting(Graphics2D g) {
        g.setBackground(Color.black); // Цвет фона
        g.clearRect(0,0,500,500);// Без очистки не поменяется фон!
        // Вращение
        g.rotate(2.3,335,220);
        // Сглаживание
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        // Рисование
        // Закрашивание корпуса
        g.setColor(Color.white);
        g.fillArc(300,0,300,400,109,120);
        g.fillArc(201,0,300,400,311,120);
        // Верхушка
        g.setColor(Color.red);
        g.setStroke(new BasicStroke(2));
        g.fill(new QuadCurve2D.Double(319,100,340,45,400,10));
        g.fill(new QuadCurve2D.Double(481,100,460,45,400,10));
        g.fillPolygon(new int[]{319,400,481}, new int[]{100,10,100}, 3);
        // Левое крыло
        g.setColor(Color.red);
        g.fill(new QuadCurve2D.Double(311,275,259,275,270,425));
        g.fillPolygon(new int[]{311,330,296}, new int[]{275,320,327}, 3);
        g.setColor(Color.black);
        g.fill(new QuadCurve2D.Double(330,320,280,300,270,425));
        g.setColor(Color.black);
        g.draw(new QuadCurve2D.Double(311,275,259,275,270,425));
        g.draw(new QuadCurve2D.Double(330,320,280,300,270,425));
        // Правое крыло
        g.setColor(Color.red);
        g.fill(new QuadCurve2D.Double(489,275,541,275,530,425));
        g.fillPolygon(new int[]{489,470,504}, new int[]{275,320,327}, 3);
        g.setColor(Color.black);
        g.fill(new QuadCurve2D.Double(470,320,520,300,530,425));
        g.setColor(Color.black);
        g.draw(new QuadCurve2D.Double(489,275,541,275,530,425));
        g.draw(new QuadCurve2D.Double(470,320,520,300,530,425));
        // Нижняя часть
        g.setColor(Color.GRAY);
        g.fill(new QuadCurve2D.Double(318,297,332,330,351,350));
        g.fill(new QuadCurve2D.Double(481,297,468,330,448,350));
        g.fillPolygon(new int[]{318,482,449,351}, new int[]{297,297,350,350}, 4);
        // Огонь
        g.setColor(Color.orange);
        g.fill(new QuadCurve2D.Double(351,350,350,450,400,600));
        g.fill(new QuadCurve2D.Double(448,350,450,450,400,600));
        g.fillPolygon(new int[]{350,449,400}, new int[]{350,350,601}, 3);
        g.setColor(Color.YELLOW);
        g.fill(new QuadCurve2D.Double(371,350,370,450,400,500));
        g.fill(new QuadCurve2D.Double(428,350,430,450,400,500));
        g.fillPolygon(new int[]{371,428,400}, new int[]{350,350,500}, 3);
        // Корпус
        g.setColor(Color.black);
        g.drawArc(300,0,300,400,109,120); // левая сторона корпуса
        g.drawArc(201,0,300,400,311,120); // правая сторона корпуса
        g.drawLine(319,100,481,100); // верхняя линия
        g.drawLine(318,297,481,297); // средняя линия
        g.drawLine(351,350,448,350); // нижняя линия
        // Иллюминатор
        g.setColor(Color.GRAY);
        g.fillOval(350,150,100,100);
        g.setColor(Color.CYAN);
        g.fillOval(365,165,70,70);
        g.setColor(Color.black);
        g.drawOval(350,150,100,100);
        g.drawOval(365,165,70,70);
        // Центральное крыло
        g.setStroke(new BasicStroke(5));
        g.drawRect(390,275,20,150);
        g.setColor(Color.red);
        g.fillRect(390,275,20,150);
        g.dispose();
    }
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Rocket());
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class Snowman extends Canvas
{
    public void paint(Graphics g0) {
        Graphics2D g = (Graphics2D) g0;
        // Сглаживание
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        // Ось
        //g.drawLine(400,0,400,800);
        // Нижний овал
        g.setStroke(new BasicStroke(5));
        g.drawOval(225,430,350,300);
        //  Правая рука
        g.setStroke(new BasicStroke(10));
        g.drawPolyline(new int[]{500,680,710,715,695,735,735,695,715,710,680,500,500},new int[]{400,380,410,405,380,380,370,365,345,340,365,380,400},13);
        g.setColor(new Color(238,238,238));
        g.fillPolygon(new int[]{500,680,710,715,695,735,735,695,715,710,680,500,500},new int[]{400,380,410,405,380,380,370,365,345,340,365,380,400},13);
        // Средний овал
        g.setColor(new Color(51,51,51));
        g.drawOval(275,300,250,200);
        g.setColor(new Color(238,238,238));
        g.fillOval(275,300,250,200);
        //Пуговицы
        g.setStroke(new BasicStroke(3));
        g.setColor(new Color(51,51,51));
        g.drawOval(415,370,15,15);
        g.drawOval(415,400,15,15);
        g.drawOval(415,430,15,15);
        // Голова
        g.setStroke(new BasicStroke(10));
        g.setColor(new Color(51,51,51));
        g.drawOval(325,170,150,150);
        g.setColor(new Color(238,238,238));
        g.fillOval(325,170,150,150);
        // Лицо
        g.setStroke(new BasicStroke(3));
        g.setColor(new Color(51,51,51));
        //Рот
        g.drawOval(420,285,15,15);
        g.drawOval(445,280,10,10);
        g.drawOval(395,285,15,15);
        g.drawOval(375,280,10,10);
        // Глаза
        g.drawOval(430,220,15,15);
        g.drawOval(380,220,15,15);
        // Нос
        g.setStroke(new BasicStroke(6));
        g.drawPolyline(new int[]{415,510,425,415},new int[]{250,250,265,250},4);
        g.setColor(new Color(238,238,238));
        g.fillPolygon(new int[]{415,510,425},new int[]{250,250,265},3);
        //  Левая рука
        g.setStroke(new BasicStroke(10));
        g.setColor(new Color(51,51,51));
        g.drawPolyline(new int[]{300,150,120,115,135,95,95,135,115,120,150,300,300},new int[]{400,380,410,405,380,380,370,365,345,340,365,380,400},13);
        g.setColor(new Color(238,238,238));
        g.fillPolygon(new int[]{300,150,120,115,135,95,95,135,115,120,150,300,300},new int[]{400,380,410,405,380,380,370,365,345,340,365,380,400},13);
        // Шляпа (овал)
        g.setColor(new Color(51,51,51));
        g.drawOval(300,170,200,30);
        g.setColor(new Color(238,238,238));
        g.fillOval(300,170,200,30);
        // Шляпа (прямоугольник)
        g.setColor(new Color(51,51,51));
        g.drawRoundRect(350,70,100,100,10,10);
        g.setColor(new Color(238,238,238));
        g.fillRoundRect(350,70,100,100,10,10);
        // Линия на шляпе
        g.setColor(new Color(51,51,51));
        g.setStroke(new BasicStroke(5));
        g.drawLine(350,140,450,140);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Snowman());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);
    }
}

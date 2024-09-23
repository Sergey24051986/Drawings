import javax.swing.*;
import java.awt.*;

public class TrafficLightsDraft extends Canvas
{
    public void paint(Graphics g) {
        setBackground(Color.GRAY);// Фон
        // Оси
//        g.drawLine(400,0,400,800); // Вертикаль
//        g.drawLine(0,220,800,220); // Горизонт1
//        g.drawLine(0,350,800,350); // Горизонт2
//        g.drawLine(0,480,800,480); // Горизонт3

        // Шляпа верх
        //g.drawArc(350,116,100,20,25,130); // Контур верхнего полукруга
        g.setColor(Color.black);
        g.fillArc(350,116,100,20,25,130);

        // Шляпа низ
        //g.drawRoundRect(350,123,100,10,10,10); // Контур нижнего прямоугольника
        g.fillRoundRect(350,123,100,10,10,10);

        // Корпус светофора
        //g.drawRoundRect(320,140,160,410,50,50); // Контур прямоугольника корпуса
        g.fillRoundRect(320,140,160,410,50,50);

        // Козырек верх(Красный)
        //g.drawArc(344,150,111,130,0, 180); // Контур верхнего полукруга
        g.setColor(Color.white);
        g.fillArc(344,150,111,130,0, 180);

        // Козырек низ(Крысиный)
        //g.drawArc(345,162,110,115,0, 180); // Контур нижнего полукруга
        g.setColor(Color.black);
        g.fillArc(345,162,110,115,0, 180);

        // Красный круг
        //g.drawOval(350,170,100,100); // Контур круга
        g.setColor(Color.RED);
        g.fillOval(350,170,100,100);

        // Козырек верх(Желтый)
        //g.drawArc(344,280,111,130,0, 180); // Контур верхнего полукруга
        g.setColor(Color.white);
        g.fillArc(344,280,111,130,0, 180);

        // Козырек низ(Желтый)
        //g.drawArc(345,292,110,115,0, 180); // Контур нижнего полукруга
        g.setColor(Color.black);
        g.fillArc(345,292,110,115,0, 180);

        // Желтый круг
        //g.drawOval(350,300,100,100); // Контур круга
        g.setColor(Color.YELLOW);
        g.fillOval(350,300,100,100);

        // Козырек верх(Зеленый)
        //g.drawArc(344,410,111,130,0, 180); // Контур верхнего полукруга
        g.setColor(Color.white);
        g.fillArc(344,410,111,130,0, 180);

        // Козырек низ(Зеленый)
        //g.drawArc(345,422,110,115,0, 180); // Контур нижнего полукруга
        g.setColor(Color.black);
        g.fillArc(345,422,110,115,0, 180);

        // Зеленый круг
        //g.drawOval(350,430,100,100); // Контур круга
        g.setColor(Color.green);
        g.fillOval(350,430,100,100);

        // Верхний левый треугольник
        //g.drawRoundRect(230,170,80,80,10,10); // Контур прямоугольника
        g.setColor(Color.black);
        g.fillRoundRect(230,170,80,80,10,10);
        //g.drawPolygon(new int[]{220,220,315},new int[]{165,260,260},3); // Контур треугольника убирающего часть прямоугольника
        g.setColor(Color.gray);
        g.fillPolygon(new int[]{220,220,315},new int[]{165,260,260},3);

        // Левый средний треугольник
        //g.drawRoundRect(230,300,80,80,10,10); // Контур прямоугольника
        g.setColor(Color.black);
        g.fillRoundRect(230,300,80,80,10,10);
        //g.drawPolygon(new int[]{220,220,315},new int[]{295,390,390},3); // Контур треугольника убирающего часть прямоугольника
        g.setColor(Color.gray);
        g.fillPolygon(new int[]{220,220,315},new int[]{295,390,390},3);

        // Левый нижний треугольник
        //g.drawRoundRect(230,430,80,80,10,10); // Контур прямоугольника
        g.setColor(Color.black);
        g.fillRoundRect(230,430,80,80,10,10);
        //g.drawPolygon(new int[]{220,220,315},new int[]{425,520,520},3); // Контур треугольника убирающего часть прямоугольника
        g.setColor(Color.gray);
        g.fillPolygon(new int[]{220,220,315},new int[]{425,520,520},3);

        // Правый верхний треугольник
        //g.drawRoundRect(490,170,80,80,10,10); // Контур прямоугольника
        g.setColor(Color.black);
        g.fillRoundRect(490,170,80,80,10,10);
        //g.drawPolygon(new int[]{580,580,485},new int[]{165,260,260},3); // Контур треугольника убирающего часть прямоугольника
        g.setColor(Color.gray);
        g.fillPolygon(new int[]{580,580,485},new int[]{165,260,260},3);

        // Правый средний треугольник
        //g.drawRoundRect(490,300,80,80,10,10); // Контур прямоугольника
        g.setColor(Color.black);
        g.fillRoundRect(490,300,80,80,10,10);
        //g.drawPolygon(new int[]{580,580,485},new int[]{295,390,390},3); // Контур треугольника убирающего часть прямоугольника
        g.setColor(Color.gray);
        g.fillPolygon(new int[]{580,580,485},new int[]{295,390,390},3);

        // Правый нижний треугольник
        g.drawRoundRect(490,430,80,80,10,10); // Контур прямоугольника
        g.setColor(Color.black);
        g.fillRoundRect(490,430,80,80,10,10);
        //g.drawPolygon(new int[]{580,580,485},new int[]{425,520,520},3); // Контур треугольника убирающего часть прямоугольника
        g.setColor(Color.gray);
        g.fillPolygon(new int[]{580,580,485},new int[]{425,520,520},3);

        // Нижний прямоугольник
        //g.drawRoundRect(370,560,60,100,10,10); // Контур прямоугольника
        g.setColor(Color.black);
        g.fillRoundRect(370,560,60,100,10,10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new TrafficLightsDraft());
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

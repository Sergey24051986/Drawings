import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Car extends Canvas {

    public Car() throws IOException {
        BufferedImage carImage = new BufferedImage(1100,600,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = carImage.createGraphics();
        painting(g);
        ImageIO.write(carImage,"png",new File("Car.png"));
    }

    public void paint(Graphics g0) {
        Graphics2D g = (Graphics2D) g0;
        painting(g);
    }
    public void painting(Graphics2D g) {
        g.setBackground(Color.white);// Цвет фона
        g.clearRect(0,0,1100,600);
        // Сглаживание
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.black);

        // Оси
        //g.drawLine(0,388,1600,388); // Горизонтальная ось по колёсам
        //g.drawLine(885,300,885,500); // Вертикальная ось переднего колеса
        //g.drawLine(250,300,250,500); // Вертикальная ось заднего колеса

        // Окрас
        g.setColor(Color.orange);
        g.fill(new QuadCurve2D.Double(124,283,130,272,153,269)); // Заднее стекло
        g.fillPolygon(new int[]{124,153,150},new int[]{283,269,286},3); // Ручка багажника
        g.fillPolygon(new int[]{115,135,202,202,260,621,669,712,935,717,375},new int[]{320,284,195,200,148,101,130,195,258,390,390},11); // Кузов
        g.fill(new QuadCurve2D.Double(262,148,350,80,621,101)); // Крыша
        g.fill(new QuadCurve2D.Double(621,101,655,105,669,130)); // Крыша
        g.fill(new QuadCurve2D.Double(710,195,870,200,936,259)); // Капот

        g.setColor(Color.lightGray);
        g.fill(new QuadCurve2D.Double(959,274,990,275,985,320)); // Передняя фара

        // Переднее крыло
        g.setColor(Color.orange);
        g.fill(new QuadCurve2D.Double(742,404,765,415,781,402));// Внешняя арка переднего крыла
        Path2D path = new Path2D.Double(); // Внешняя арка переднего крыла
        path.moveTo(720,379); // Внешняя арка переднего крыла
        path.curveTo(750,210,970,200,991,341); // Внешняя арка переднего крыла
        g.fill(path); // Внешняя арка переднего крыла
        g.fillPolygon(new int[]{750,717,742,781,994,990},new int[]{210,390,404,402,359,340},6); // Внешняя арка переднего крыла
        g.setColor(Color.darkGray);
        Path2D path1 = new Path2D.Double(); // Внутренняя арка переднего крыла
        path1.moveTo(781,402); // Внутренняя арка переднего крыла
        path1.curveTo(820,260,950,270,982,355);  // Внутренняя арка переднего крыла
        g.fill(path1); // Внутренняя арка переднего крыла
        g.fillPolygon(new int[]{982,781,983},new int[]{354,402,363},3); // Внутренняя арка переднего крыла

        // Заднее крыло
        g.setColor(Color.orange);
        Path2D path2 = new Path2D.Double();// Внешняя арка заднего крыла
        path2.moveTo(84,397);// Внешняя арка заднего крыла
        path2.curveTo(100,230,380,200,375,390);// Внешняя арка заднего крыла
        g.fill(path2);// Внешняя арка заднего крыла
        g.setColor(Color.darkGray);
        g.fillPolygon(new int[]{340,260,100},new int[]{397,303,397},3); // Внутренняя арка заднего крыла
        g.setColor(Color.orange);
        g.fill(new QuadCurve2D.Double(366,414,340,420,339,397));// Внешняя арка заднего крыла
        g.fill(new QuadCurve2D.Double(125,388,110,400,84,397));// Внешняя арка заднего крыла
        g.fillPolygon(new int[]{84,125,140},new int[]{397,388,370},3); // Внешняя арка заднего крыла
        g.fillPolygon(new int[]{339,366,375,339},new int[]{397,414,390,390},4); // Внешняя арка заднего крыла
        g.setColor(Color.darkGray);
        g.fill(new QuadCurve2D.Double(339,397,330,315,260,303));// Внутренняя арка заднего крыла
        g.fill(new QuadCurve2D.Double(260,303,160,300,125,388));// Внешняя арка заднего крыла

        g.fillPolygon(new int[]{375,370,740,717},new int[]{390,400,400,390},4);// Порог
        g.fill(new QuadCurve2D.Double(742,404,747,390,720,379)); // Темная часть у порога
        g.fillPolygon(new int[]{743,720,717},new int[]{404,378,390},3);// Темная часть у порога

        g.setColor(Color.lightGray);
        //g.fill(new QuadCurve2D.Double(959,274,990,275,985,320)); // Передняя фара
        g.fill(new QuadCurve2D.Double(982,355,975,363,983,369)); // Передний бампер
        g.fill(new QuadCurve2D.Double(983,369,1015,370,1000,334)); // Передний бампер
        g.fill(new QuadCurve2D.Double(1000,334,980,350,995,352)); // Передний бампер
        g.fillPolygon(new int[]{982,983,995},new int[]{355,369,352},3); // Ручка багажника
        g.fillRoundRect(370,400,370,7,5,5);// Порог

        g.fillPolygon(new int[]{478,478,494,493,529,492},new int[]{244,258,258,250,250,243},5); // Ручка двери
        g.fill(new QuadCurve2D.Double(478,244,525,240,529,250)); // Ручка двери
        g.fill(new QuadCurve2D.Double(529,250,520,248,486,250)); // Ручка двери

        // Рисование
        // Порог
        g.setColor(Color.black);
        g.drawRoundRect(370,400,370,7,5,5);
        g.drawPolygon(new int[]{375,370,740,717},new int[]{390,400,400,390},4);
        // Переднее крыло
        g.draw(new QuadCurve2D.Double(742,404,747,390,720,379)); // Темная часть у порога
        g.draw(new QuadCurve2D.Double(742,404,765,415,781,402));
        g.draw(path); // Внешняя арка переднего крыла контур
        g.drawLine(781,402,979,363);
        g.draw(path1); // Внутренняя арка переднего крыла контур
        g.drawLine(717,390,720,379);
        // Передний бампер
        g.draw(new QuadCurve2D.Double(982,355,975,363,983,369));
        g.draw(new QuadCurve2D.Double(983,369,1015,370,1000,334));
        g.draw(new QuadCurve2D.Double(1000,334,980,350,995,352));
        g.drawLine(995,352,982,355);
        // Переднее колесо
        g.setColor(Color.black);
        g.fillOval(802,305,166,166); // Шина
        g.setColor(Color.orange);
        g.fillOval(830,333,110,110); // Диск
        g.setColor(Color.lightGray);
        g.fillOval(855,358,60,60); // Колпак
        // Контуры
        g.setColor(Color.black);
        g.drawOval(802,305,166,166); // Шина
        g.drawArc(879,382,12,12,90,270);
        g.drawOval(855,358,60,60); // Колпак
        g.drawOval(845,348,80,80);
        g.drawOval(840,343,90,90);
        g.drawOval(830,333,110,110);// Диск

        // Заднее крыло
        g.drawLine(375,390,366,414);
        g.draw(new QuadCurve2D.Double(366,414,340,420,339,397));
        g.draw(new QuadCurve2D.Double(339,397,330,315,260,303));
        g.draw(new QuadCurve2D.Double(260,303,160,300,125,388));
        g.draw(new QuadCurve2D.Double(125,388,110,400,84,397));
        g.draw(path2);// Внутренняя арка заднего крыла
        g.drawLine(339,397,100,397);// Внутренняя арка заднего крыла

        // Заднее колесо
        g.setColor(Color.black);
        g.fillOval(167,305,166,166); // Шина
        g.setColor(Color.orange);
        g.fillOval(195,333,110,110); // Диск
        g.setColor(Color.lightGray);
        g.fillOval(220,358,60,60); // Колпак
        // Контуры
        g.setColor(Color.black);
        g.drawOval(167,305,166,166);
        g.drawArc(244,382,12,12,90,270);
        g.drawOval(220,358,60,60);
        g.drawOval(210,348,80,80);
        g.drawOval(205,343,90,90);
        g.drawOval(195,333,110,110);

        // Кузов
        g.drawLine(115,320,135,284);
        g.drawLine(139,284,124,283);
        g.draw(new QuadCurve2D.Double(124,283,130,272,153,269));
        g.drawLine(143,271,202,195);
        g.setColor(Color.CYAN);
        g.fill(new QuadCurve2D.Double(202,200,203,225,262,148)); // Окрас заднего стекла
        g.setColor(Color.black);
        g.draw(new QuadCurve2D.Double(202,195,200,230,262,148)); // Рамка заднего стекла
        g.drawLine(202,200,260,150); // Заднее стекло
        g.draw(new QuadCurve2D.Double(262,148,350,80,621,101)); // Крыша
        g.draw(new QuadCurve2D.Double(621,101,655,105,669,130));
        g.drawLine(669,130,712,195);// Лобовое стекло
        g.draw(new QuadCurve2D.Double(712,195,870,200,935,258)); // Капот
        g.draw(new QuadCurve2D.Double(718,195,725,220,734,223)); // Капот
        g.draw(new QuadCurve2D.Double(734,223,850,230,888,244)); // Капот
        g.draw(new QuadCurve2D.Double(888,244,930,250,900,234)); // Капот
        g.draw(new QuadCurve2D.Double(959,274,990,275,985,320)); // Передняя фара
        g.draw(new QuadCurve2D.Double(175,274,280,150,327,136));
        g.draw(new QuadCurve2D.Double(327,136,390,110,612,120));
        g.draw(new QuadCurve2D.Double(612,120,655,120,679,166));
        g.drawLine(679,166,714,226);// Дверь
        g.drawLine(714,226,714,390); // Дверь
        g.drawLine(465,117,466,389); // Дверь
        g.drawRect(708,244,6,10); // Петля верхняя
        g.drawRect(708,254,6,10); // Петля верхняя

        g.drawRect(708,355,6,10); // Петля нижняя
        g.drawRect(708,365,6,10); // Петля нижняя

        g.draw(new QuadCurve2D.Double(478,244,525,240,529,250)); // Ручка двери
        g.draw(new QuadCurve2D.Double(529,250,520,248,486,250)); // Ручка двери
        g.drawLine(494,250,494,258); // Ручка двери
        g.drawLine(494,258,478,258); // Ручка двери
        g.drawLine(478,258,478,244); // Ручка двери

        g.draw(new QuadCurve2D.Double(252,260,400,210,851,242)); // Линия по кузову

        // Заднее стекло (Finish)
        g.setColor(Color.CYAN);
        g.fill(new QuadCurve2D.Double(432,208,455,204,455,187)); // Окрас
        g.fill(new QuadCurve2D.Double(455,148,455,130,426,132)); // Окрас
        g.fill(new QuadCurve2D.Double(426,132,340,135,310,165)); // Окрас
        g.fill(new QuadCurve2D.Double(310,165,270,194,307,212)); // Окрас
        g.fillPolygon(new int[]{432,455,455,426,310,307},new int[]{208,187,148,132,165,212},6); // Окрас

        // Контуры заднего стекла
        g.setColor(Color.black);
        g.drawLine(307,212,432,208);
        g.draw(new QuadCurve2D.Double(432,208,455,204,455,187));
        g.drawLine(455,187,455,148);
        g.draw(new QuadCurve2D.Double(455,148,455,130,426,132));
        g.draw(new QuadCurve2D.Double(426,132,340,135,310,165));
        g.draw(new QuadCurve2D.Double(310,165,270,194,307,212));

        // Переднее стекло (Finish)
        g.setColor(Color.CYAN);
        g.fill(new QuadCurve2D.Double(661,207,690,205,680,188)); // Окрас
        g.fill(new QuadCurve2D.Double(680,188,660,135,620,135)); // Окрас
        g.fill(new QuadCurve2D.Double(506,132,482,132,483,148)); // Окрас
        g.fill(new QuadCurve2D.Double(483,193,482,208,508,209)); // Окрас
        g.fillPolygon(new int[]{661,680,620,506,483,483,508},new int[]{207,188,135,132,148,193,209},7); // Окрас

        // Контуры переднего стекла
        g.setColor(Color.black);
        g.drawLine(508,209,661,207);
        g.draw(new QuadCurve2D.Double(661,207,690,205,680,188));
        g.draw(new QuadCurve2D.Double(680,188,660,135,620,135));
        g.drawLine(620,135,506,132);
        g.draw(new QuadCurve2D.Double(506,132,482,132,483,148));
        g.drawLine(483,148,483,193);
        g.draw(new QuadCurve2D.Double(483,193,482,208,508,209));

        // Задний фонарь (Finish)
        g.setColor(Color.red);
        Path2D path3 = new Path2D.Double();
        path3.moveTo(111,311);
        path3.curveTo(95,310,83,370,90,365);
        g.fill(path3);
        g.setColor(Color.ORANGE);
        g.fillPolygon(new int[]{124,111,96},new int[]{303,309,351},3);
        // Контуры фонаря
        g.setColor(Color.black);
        g.drawLine(124,303,111,309);
        g.drawLine(111,309,96,351);
        g.draw(path3);
        g.dispose();
    }

    public static void main(String[] args) throws IOException{
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100,600);
        frame.add(new Car());
        frame.setVisible(true);
    }
}
package David.Figuras;

import javax.swing.*;
import java.awt.*;

public class JPanelDrawing extends JPanel {

    // Constructor for the drawing panel

    public JPanelDrawing() {
        this.setBackground(Color.white);
    }

    // reimplements paint
    public void paint(Graphics g) {
        super.paint(g);

        //lines
        g.drawLine(23, 90, 60, 50); // draws a line

        int n = 3;

        for (int i = 1; i <= n; i++) {
            //ovals
            int Random = (int) (Math.random() * 100);
            System.out.println(Random);
            int Random1 = (int) (Math.random() * 100);
            System.out.println(Random1);
            int Random2 = (int) (Math.random() * 100);
            System.out.println(Random2);
            int Random3 = (int) (Math.random() * 100);
            System.out.println(Random3);

            Oval oval = new Oval(Random, Random1, Random2, Random3);
            g.setColor(Color.MAGENTA);
            g.drawOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight()); // draws a non filled oval

            //rectangles
            int Random4 = (int) (Math.random() * 100);
            System.out.println(Random);
            int Random5 = (int) (Math.random() * 100);
            System.out.println(Random1);
            int Random6 = (int) (Math.random() * 100);
            System.out.println(Random2);
            int Random7 = (int) (Math.random() * 100);
            System.out.println(Random3);

            Rectangle rectangle = new Rectangle(Random4 + 90, Random5 + 70, Random6 + 30, Random7 + 50);
            g.setColor(Color.blue);
            g.drawRect(rectangle.getSx(), rectangle.getSy(), rectangle.getSwidth(), rectangle.getSheight());
        }

        //strings
        Font font = new Font("Arial", Font.BOLD, 15);
        g.setColor(Color.red);
        g.setFont(font);
        g.drawString("Hello World!", 5, 400);

        //arc
        g.setColor(Color.yellow);
        g.fillArc(240, 340, 100, 100, 25, 300);
        g.setColor(Color.white);
        g.fillArc(240, 340, 100, 100, 15, 10);
        g.fillArc(240, 340, 100, 100, 325, 10);

        //polygons
        Polygon star = new Polygon();
        // this is not star
        int cX[] = {420, 440, 460, 480, 500, 420, 420};
        int cY[] = {470, 430, 450, 430, 490, 490, 470};

        star.addPoint(510, 355);
        star.addPoint(590, 355);
        star.addPoint(525, 415);
        star.addPoint(550, 330);
        star.addPoint(580, 415);

        g.setColor(Color.red);
        g.drawPolygon(star);
        g.setColor(Color.blue);
        g.fillPolygon(cX, cY, cX.length);

    }
}

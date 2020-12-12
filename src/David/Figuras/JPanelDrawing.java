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

        int n = 10;

        //lines
        g.drawLine(23, 90, 60, 50); // draws a line

        //ovals
        for (int i = 0; i < n; i++) {
            Oval oval = new Oval(oval.setX((int) Math.random()), oval.setY((int) Math.random()), oval.setWidth((int) Math.random()), oval.setHeight((int) Math.random()));
            g.setColor(Color.MAGENTA);
            g.fillOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight()); // draws a non filled oval

            //rectangles
            Rectangle rectangle = new Rectangle(rectangle.setSx((int) Math.random()), rectangle.setSy((int) Math.random()), rectangle.setSwidth((int) Math.random()), rectangle.setSheight((int) Math.random()));
            g.setColor(Color.blue);
            g.fillRect(rectangle.getSx(), rectangle.getSy(), rectangle.getSwidth(), rectangle.getSheight());
        }
/*
        //strings
        Font font = new Font("Arial", Font.BOLD,15);
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
        int cX[] = {420,440,460,480,500,420,420};
        int cY[] = {470,430,450,430,490,490,470};

        star.addPoint(510,355);
        star.addPoint(590,355);
        star.addPoint(525,415);
        star.addPoint(550,330);
        star.addPoint(580,415);

        g.setColor(Color.red);
        g.drawPolygon(star);
        g.setColor(Color.blue);
        g.fillPolygon(cX,cY,cX.length);
         */
    }
}

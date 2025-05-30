import java.applet.Applet;
import java.awt.*;


public class DisplayApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Hello, Java Applet!", 20, 20);
        
        g.setColor(Color.BLACK);
        g.drawLine(20, 40, 200, 40);

        g.drawRect(20, 60, 100, 50);
        g.fillRect(140, 60, 100, 50);

        g.drawOval(20, 130, 100, 50);
        g.fillOval(140, 130, 100, 50);
    }
}

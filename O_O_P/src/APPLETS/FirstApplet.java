package APPLETS;

import java.applet.Applet; // import necessary libraries for an applet
import java.awt.Graphics;

public class FirstApplet extends Applet {

        public void paint(Graphics g) {
            g.drawString("Krasimir Iliev", 50, 25);
        }


    public static void main(String[] args) {

        System.out.println("");
        FirstApplet myApplet = new FirstApplet();
        //myApplet.paint();

    }
}

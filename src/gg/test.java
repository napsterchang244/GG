/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gg;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author nickchang244
 */
public class test extends JFrame{
    
    public test() {
        this.setPreferredSize(new Dimension(400, 400));
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // define the position
        int loc1X = 100;
        int loc1Y = 200;
        

        // draw a line (there is now drawPoint..)
        g.drawLine(loc1X, loc1X, loc1X, loc1Y); 
        g.drawLine(100, 200, 200, 200); 
        g.drawLine(200, 100,300 , 100); 
        g.drawLine(300, 100, 200, 200); 
        g.drawLine(200, 200, 300, 200); 
        
    }
}

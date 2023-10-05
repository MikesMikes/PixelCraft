package MikesMikes.tutorials;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.Robot.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 * @author MikesMikes
 */
public class Main {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
//        Robot robot = new Robot();
//        //java.awt.Color[r=75,g=219,b=106]
//        Color x = new Color(75, 219, 106);
//        Color color = robot.getPixelColor(1500, 600);
//        Point point = MouseInfo.getPointerInfo().getLocation();


        JFrame frame = new JFrame("Clicker");
        Label label = new Label("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.pack();
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.setVisible(true);

//        while (true){
//            color = robot.getPixelColor(1500, 600);
//            robot.delay(100);
//            System.out.println(color);
//            System.out.println(color==x);
//            if (robot.getPixelColor(1500,600).equals(x)){
//                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//            }
//
//        }


    }


}
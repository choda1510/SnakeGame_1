package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

import screen.GraphicOutputPanel;

public class SnakeGame implements Runnable {
    @Override
    public void run() {
        JFrame frame = new JFrame("Snake Game");
        Dimension windowDim = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameDim = new Dimension(400, 300);
        frame.setLocation(
            (int)((windowDim.getWidth() - frameDim.getWidth()) / 2), 
            (int)((windowDim.getHeight() - frameDim.getHeight()) / 2)
        );
        frame.setSize(frameDim);
        frame.setContentPane(new GraphicOutputPanel());
        frame.revalidate();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package game;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyboardListener implements KeyListner {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
}

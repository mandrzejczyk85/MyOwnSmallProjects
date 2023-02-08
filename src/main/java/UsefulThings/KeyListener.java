package UsefulThings;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame implements java.awt.event.KeyListener {

    KeyListener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new KeyListener();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c = '"';
        if (e.getKeyCode()==KeyEvent.VK_ENTER) {
            System.out.println("You press key "+c+"Enter"+c);
        } else {
            System.out.println("You released key char: " + e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
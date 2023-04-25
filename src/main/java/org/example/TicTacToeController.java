package org.example;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToeController implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at x: (" + e.getX() + " y: " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

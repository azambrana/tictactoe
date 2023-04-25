package org.example.controller;

import org.example.model.TicTacToeModel;
import org.example.view.TicTacToeView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToeController implements MouseListener {
    private TicTacToeModel ticTacToeModel;
    private TicTacToeView ticTacToeView;

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

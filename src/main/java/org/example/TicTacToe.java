package org.example;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

public class TicTacToe extends JFrame {
    TicTacToeController controller;
    TicTacToe() {
        this.setTitle("Tic Tac Toe");
        this.setSize(new Dimension(500, 500));
        // init controller
        controller = new TicTacToeController();
        this.addMouseListener(controller);
    }

    public void startGame() {
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new java.lang.Runnable() {
            @Override
            public void run() {
                TicTacToe ticTacToe = new TicTacToe();
                ticTacToe.startGame();
            }
        });
    }
}

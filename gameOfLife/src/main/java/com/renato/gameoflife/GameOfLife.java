/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.renato.gameoflife;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author renat
 */
public class GameOfLife {
    MainWindow window;
    
    public static void main(String[] args) {
        Game game = new Game(15);
        
        MainWindow window = new MainWindow(game);
        window.populateGrid();
        window.setMaximumSize(new Dimension(1280, 720));
        window.setSize(25 + game.gridSize * 20 , 100 + game.gridSize*20);
        
        window.setVisible(true);
        
        
        //game.calculateNextGeneration();
    }
}

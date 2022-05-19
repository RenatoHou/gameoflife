/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.renato.gameoflife;

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
        window.setVisible(true);
        
        
        //game.calculateNextGeneration();
    }
}

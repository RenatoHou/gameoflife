/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renato.gameoflife;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author renat
 */
public class Cell {
    int positionX;
    int positionY;
    boolean isAlive;
    boolean isAliveInNextGen;
    JButton cellButton; 
    Game game;
    
    public Cell(){
        isAlive = false;
        cellButton = new JButton();
        cellButton.setSize(10, 10);
        cellButton.setOpaque(true);
        cellButton.setBackground(Color.WHITE);
        cellButton.addActionListener(e -> this.changeAliveState());
    }
    
    public Cell(int i, int j, Game game){
        this();
        positionX = i;
        positionY = j;
        this.game = game;
    }
    
    public void goToNextGen(){
        isAlive = isAliveInNextGen;
        colorCell();
    }
    
    public void setNextGeneration(int liveNeighbors){
        switch (liveNeighbors){
            case 0, 1, 4, 5, 6, 7, 8 -> isAliveInNextGen = false;
            case 2 -> isAliveInNextGen = isAlive;
            case 3 -> isAliveInNextGen = true;
                
        }
    }
    
    
    public void changeAliveState(){
        isAlive = !isAlive;
        colorCell();
    }
    
    private void colorCell(){
        if (isAlive){
            cellButton.setBackground(Color.BLACK);
        }else{
            cellButton.setBackground(Color.WHITE);
        }
    }
}

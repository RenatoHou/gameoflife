/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renato.gameoflife;

/**
 *
 * @author renat
 */
public class Cell {
    int positionX;
    int positionY;
    boolean isAlive;
    boolean isAliveInNextGen;
    
    public Cell(){
        isAlive = true;
    }
    
    public void setNextGen(){
        isAlive = isAliveInNextGen;
    }
    
    public void setNextGeneration(int liveNeighbors){
        switch (liveNeighbors){
            case 0, 1, 4, 5, 6, 7, 8:
                isAliveInNextGen = false;
                break;
            case 3:
                isAliveInNextGen = true;
                break;
                
        }
    }
    
}

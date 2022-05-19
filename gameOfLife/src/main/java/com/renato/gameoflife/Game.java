/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renato.gameoflife;

import javax.swing.JButton;

/**
 *
 * @author renat
 * 
 * Maintain game state
 */
public class Game {
    Cell[][] grid;   
    int gridSize;
     
    public Game(int size){
        gridSize = size;
        grid = new Cell[size][size];
        //initialize grid cells
        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){          
                grid[i][j] = new Cell(i, j, this);
            }
        }   
        
    }
    
    public void calculateNextGeneration(){
        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){
                
                grid[i][j].setNextGeneration(contaVizinhos(i, j));
        
            }
        }
        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){
                grid[i][j].goToNextGen();
            }
        }     
    }
    
    private int contaVizinhos(int i, int j){
        int liveNeighbors = 0;
        for (int x = -1; x <= 1; x++){
                    for (int y = -1; y <=1; y++){
                        if (!(x == 0 && y ==0)){//nao conta ela mesma       
                            if (i + x >= 0 && j+y >=0 && i + x < gridSize && j + y < gridSize){ //evita negativos e fora do grid
                                if (grid[i+x][j+y].isAlive){
                                    liveNeighbors++;
                                }
                            }
                        } 
                    }
                }
        return liveNeighbors;
    }
    
    public void limpar() {
        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){          
                grid[i][j].limpar();
            }
        }   
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renato.gameoflife;

/**
 *
 * @author renat
 */
public class Game {
    Cell[][] grid;
    //Cell[][] nextGen;
    int gridSize;
     
    public Game(int size){
        gridSize = size;
        grid = new Cell[size][size];
        //nextGen = new Cell[size][size];
        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){
                grid[i][j] = new Cell();
            }
        }
    }
    
    public void calculateNextGeneration(){
        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){
                int liveNeighbor = 0;
                
                //conta vizinhos vivos
                for (int x = -1; x <= 1; x++){
                    for (int y = -1; y <=1; y++){
                        if (x != y){//nao conta ela mesma
                            if (i + x >= 0 && j+y >=0 && i + x < gridSize && j + y < gridSize){ //evita negativos e fora do grid
                                if (grid[i+x][j+y].isAlive){
                                    liveNeighbor++;
                                }
                            }
                        }
                    }
                }
                
                //seleciona numero de vizinhos vivos.
                
                
            }
        }
    }
}

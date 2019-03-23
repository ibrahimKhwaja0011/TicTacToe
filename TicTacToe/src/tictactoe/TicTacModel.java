/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Objects;

/**
 *
 * @author Ibrahim
 */
public class TicTacModel {
    
    public boolean isPlayerX = true;
    
    public String EvaluateCurrentState(String [] Arr)
    {
        //Horizontal Check : X   
        if(Arr[1].equals("X") && Arr[2].equals("X") && Arr[3].equals("X"))
        {
            return "Player X Won";
        }
        if(Arr[4].equals("X") && Arr[5].equals("X") && Arr[6].equals("X"))
        {
            return "Player X Won";
        }
        if(Arr[7].equals("X") && Arr[8].equals("X") && Arr[9].equals("X"))
        {
            return "Player X Won";
        }
        
        //Horizontal Check : O
        if(Arr[1].equals("O") && Arr[2].equals("O") && Arr[3].equals("O"))
        {
            return "Player O Won";
        }
        if(Arr[4].equals("O") && Arr[5].equals("O") && Arr[6].equals("O"))
        {
            return "Player O Won";
        }
        if(Arr[7].equals("O") && Arr[8].equals("O") && Arr[9].equals("O"))
        {
            return "Player O Won";
        }
        //Vetrical Check 
        
        if(Arr[1].equals("X") && Arr[4].equals("X") && Arr[7].equals("X"))
        {
            return "Player X Won";
        }
        if(Arr[2].equals("X") && Arr[5].equals("X") && Arr[8].equals("X"))
        {
            return "Player X Won";
        }
        if(Arr[3].equals("X") && Arr[6].equals("X") && Arr[9].equals("X"))
        {
            return "Player X Won";
        }
        
        //Vertical Check : O
        if(Arr[1].equals("O") && Arr[4].equals("O") && Arr[7].equals("O"))
        {
            return "Player O Won";
        }
        if(Arr[2].equals("O") && Arr[5].equals("O") && Arr[8].equals("O"))
        {
            return "Player O Won";
        }
        if(Arr[3].equals("O") && Arr[6].equals("O") && Arr[9].equals("O"))
        {
            return "Player O Won";
        }
        
        //Diagonal Check 
        
        if(Arr[1].equals("X") && Arr[5].equals("X") && Arr[9].equals("X"))
        {
            return "Player X Won";
        }
        if(Arr[3].equals("X") && Arr[5].equals("X") && Arr[7].equals("X"))
        {
            return "Player X Won";
        }
        
        if(Arr[1].equals("O") && Arr[5].equals("O") && Arr[9].equals("O"))
        {
            return "Player O Won";
        }
        if(Arr[3].equals("O") && Arr[5].equals("O") && Arr[7].equals("O"))
        {
            return "Player O Won";
        }
        
        return "Keep Playing";
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ibrahim
 */
public class TicTacController 
{
    
   public TicTacController()
   {
       
        TicTacView board = new TicTacView();
        board.setVisible(true);
        
        TicTacModel TTState = new TicTacModel();
        
        String WinnerFromModel = "" ;
        
            board.b1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {
                    
                    if("X".equals(board.isPlayerTurn.getText()))
                    {                        
                        board.b1.setText("X");
                        board.isPlayerTurn.setText("O");
                        board.b1.setEnabled(false);                        
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b1.setText("O");
                        board.isPlayerTurn.setText("X");
                        board.b1.setEnabled(false);
                    }  
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                    
                }
            });

            board.b2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b2.setText("X");
                        board.isPlayerTurn.setText("O");
                        board.b2.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b2.setText("O");
                        board.isPlayerTurn.setText("X");
                        board.b2.setEnabled(false);
                    }              
                    
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                    
                }
            });

            board.b3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                   if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b3.setText("X");
                        board.isPlayerTurn.setText("O");   
                        board.b3.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b3.setText("O");
                        board.isPlayerTurn.setText("X"); 
                        board.b3.setEnabled(false);
                    }
                     
                     if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                }
            });
            
            
            board.b4.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b4.setText("X");
                        board.isPlayerTurn.setText("O");   
                        board.b4.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b4.setText("O");
                        board.isPlayerTurn.setText("X"); 
                        board.b4.setEnabled(false);
                    }
                    
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                }
            });

            board.b5.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b5.setText("X");
                        board.isPlayerTurn.setText("O");   
                        board.b5.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b5.setText("O");
                        board.isPlayerTurn.setText("X"); 
                        board.b5.setEnabled(false);
                    }
                     
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                }
            });

            board.b6.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b6.setText("X");
                        board.isPlayerTurn.setText("O");   
                        board.b6.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b6.setText("O");
                        board.isPlayerTurn.setText("X"); 
                        board.b6.setEnabled(false);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                }
            });
            
            
            board.b7.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b7.setText("X");
                        board.isPlayerTurn.setText("O");   
                        board.b7.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b7.setText("O");
                        board.isPlayerTurn.setText("X"); 
                        board.b7.setEnabled(false);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }    
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                }
            });

            board.b8.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b8.setText("X");
                        board.isPlayerTurn.setText("O");   
                        board.b8.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b8.setText("O");
                        board.isPlayerTurn.setText("X"); 
                        board.b8.setEnabled(false);
                    }             
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                }
            });

            board.b9.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    if("X".equals(board.isPlayerTurn.getText()))
                    {
                        board.b9.setText("X");
                        board.isPlayerTurn.setText("O");   
                        board.b9.setEnabled(false);
                    }
                    else if ("O".equals(board.isPlayerTurn.getText()))
                    {
                        board.b9.setText("O");
                        board.isPlayerTurn.setText("X"); 
                        board.b9.setEnabled(false);
                    } 
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player X Won")){
                       board.ResStatus.setText("Player X Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(TTState.EvaluateCurrentState(getcurrentState(board)).equals("Player O Won")){
                       board.ResStatus.setText("Player O Won");
                       board.ResStatus.setVisible(true);
                       BoardDisable(board);
                    }
                    if(checkDraw(board).equals("Draw"))
                    {
                        board.ResStatus.setText("Draw");
                        BoardDisable(board);
                    }
                }
            });
            
            board.btnreset.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    board.setVisible(false);
                    board.dispose();
                    TicTacController NewGame = new TicTacController();
                }
            });
            
        }
   
   public void BoardDisable(TicTacView bx) 
   {
     bx.b1.setEnabled(false);
     bx.b2.setEnabled(false);
     bx.b3.setEnabled(false);
     bx.b4.setEnabled(false);
     bx.b5.setEnabled(false);
     bx.b6.setEnabled(false);
     bx.b7.setEnabled(false);
     bx.b8.setEnabled(false);
     bx.b9.setEnabled(false);
   }
   
   public String checkDraw(TicTacView CurrentStateBoard){
       
       String [] Arr;
       Arr = getcurrentState(CurrentStateBoard);
       
       for(int i=1 ; i<10 ; i++)
       {
          if(Arr[i]=="")
          {
              return "";
          }    
       }
       if(Arr[1]!="" && Arr[2]!="" && Arr[3]!="" &&
          Arr[4]!="" && Arr[5]!="" && Arr[6]!="" && 
          Arr[7]!="" && Arr[8]!=""&& Arr[9]!="")
       {
           return "Draw";
           
       }
      return "";
   }
   
   public String [] getcurrentState(TicTacView CurrentStateBoard)
   {
      String[] strArray = new String[10]; 
      
      strArray[0] = "";
      strArray[1] = CurrentStateBoard.b1.getText();
      strArray[2] = CurrentStateBoard.b2.getText();
      strArray[3] = CurrentStateBoard.b3.getText();
      strArray[4] = CurrentStateBoard.b4.getText();
      strArray[5] = CurrentStateBoard.b5.getText();
      strArray[6] = CurrentStateBoard.b6.getText();
      strArray[7] = CurrentStateBoard.b7.getText();
      strArray[8] = CurrentStateBoard.b8.getText();
      strArray[9] = CurrentStateBoard.b9.getText();
      
      return   strArray;
   }
   
}
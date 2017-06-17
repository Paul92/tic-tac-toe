package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Board a = new Board();
        a.createBoard();
        new Marker(a);
    }
}

class Board {
    private String[][] board = new String[3][3];

    Board(){
        System.out.println("New board created! Why do I need this?");
    }

    void createBoard(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = "";
            }
            showBoard(i);
        }
    }

    private void showBoard(int increment){
        System.out.println(Arrays.deepToString(board[increment]));
    }
}

class Marker extends Board{
    private int turn;

    Marker(Board board) {
        while (turn < 9) {
            System.out.print("Enter a row (1-3): ");
            Scanner sc = new Scanner(System.in);
            int rowChoice = sc.nextInt() - 1;
            System.out.print("Enter a column (1-3): ");
            int colChoice = sc.nextInt() - 1;
            if ((board[rowChoice][colChoice].equals("")) && turn % 2 == 0) {
                String playerOne = "X";
                board[rowChoice][colChoice] = playerOne;
            } else if ((board[rowChoice][colChoice].equals("")) && turn % 2 != 0) {
                String playerTwo = "O";
                board[rowChoice][colChoice] = playerTwo;
            } else {
                System.out.println("That space is taken! Try again!");
                turn--;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(Arrays.deepToString(board[i]));
            }
            turn++;
        }
    }
}
package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static String[][] board = new String[3][3];
    public static String playerOne = "X";
    public static String playerTwo = "O";
    public static Scanner sc = new Scanner(System.in);

    public static int turn;
    public static int rowChoice;
    public static int colChoice;


    public static void main(String[] args) {
        board();
        runGame();
    }

    public static void board(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = "";
            }
        }
    }
    public static void runGame(){
        while (turn < 9){
            System.out.print("Enter a row (1-3): ");
            rowChoice = sc.nextInt() - 1;
            System.out.print("Enter a column (1-3): ");
            colChoice = sc.nextInt() - 1;
            if (board[rowChoice][colChoice] == "" && turn % 2 == 0){
                board[rowChoice][colChoice] = "X";
            } else if (board[rowChoice][colChoice] == "" && turn % 2 != 0){
                board[rowChoice][colChoice] = "O";
            } else {
                System.out.println("That space is taken! Try again!");
                turn--;
            }
            for (int i = 0; i < 3; i++){
                System.out.println(Arrays.deepToString(board[i]));
            }
            turn++;
        }
    }
}

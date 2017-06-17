package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static String[][] board = new String[3][3];
    private static Scanner sc = new Scanner(System.in);

    private static int turn;

    public static void main(String[] args) {
        board();
        runGame();
    }

    private static void board(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = "";
            }
        }
    }
    private static void runGame(){
        while (turn < 9){
            System.out.print("Enter a row (1-3): ");
            int rowChoice = sc.nextInt() - 1;
            System.out.print("Enter a column (1-3): ");
            int colChoice = sc.nextInt() - 1;
            if (Objects.equals(board[rowChoice][colChoice], "") && turn % 2 == 0){
                String playerOne = "X";
                board[rowChoice][colChoice] = playerOne;
            } else if (Objects.equals(board[rowChoice][colChoice], "") && turn % 2 != 0){
                String playerTwo = "O";
                board[rowChoice][colChoice] = playerTwo;
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

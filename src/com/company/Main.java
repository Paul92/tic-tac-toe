package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}

class Board {
    private String[][] board = new String[3][3];

    Board(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = "";
            }
        }
        showBoard();
    }

    public void showBoard(){
        for (int i = 0; i < 3; i++)
            System.out.println(Arrays.deepToString(board));
    }

    public void setValue(String value, int row, int col) {
        board[row][col] = value;
    }

    public boolean checkValue(String value, int row, int col) {
        return board[row][col] == value;
    }

    public boolean empty(int row, int col) {
        return board[row][col] == "";
    }
}

class Game {
    private int turn = 0;
    private Board gameBoard;

    private String playerOne = "X";
    private String playerTwo = "O";

    Game() {
    }

    public void play() {
        while (turn < 9) {
            System.out.print("Enter a row (1-3): ");
            Scanner sc = new Scanner(System.in);
            int rowChoice = sc.nextInt() - 1;
            System.out.print("Enter a column (1-3): ");
            int colChoice = sc.nextInt() - 1;

            if (gameBoard.empty(rowChoice, colChoice) && turn % 2 == 0) {
                gameBoard.setValue(playerOne, rowChoice, colChoice);
            } else if (gameBoard.empty(rowChoice, colChoice) && turn % 2 == 1) {
                gameBoard.setValue(playerTwo, rowChoice, colChoice);
            } else {
                System.out.println("That space is taken! Try again!");
                turn--;
            }
            gameBoard.showBoard();
            turn++;
        }
    }
}


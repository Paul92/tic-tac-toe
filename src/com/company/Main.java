package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static String[][] board = new String[3][3];
    public static void main(String[] args) {
        board();

    }

    public static void board(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = "";
            }
            System.out.println(Arrays.deepToString(board[i]));
        }
    }

    public static void checker(){

    }

}

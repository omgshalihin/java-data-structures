package org.example.basic;

import java.util.Arrays;

public class WorkingWith2DArrays {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }

        // default
        System.out.println(Arrays.deepToString(board));

        //win
        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        System.out.println(Arrays.deepToString(board));

        char[][] boardTwo = {
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'},
        };

        System.out.println(Arrays.deepToString(boardTwo));
        //win
        boardTwo[0][0] = 'O';
        boardTwo[1][0] = 'O';
        boardTwo[2][0] = 'O';
        System.out.println(Arrays.deepToString(boardTwo));
    }
}

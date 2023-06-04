package Recursionfile;

import java.util.*;

import javax.print.FlavorException;

public class WordMaze {
    public static void main(String[] args) {
        boolean[][] ok = new boolean[3][5];
        char[][] board = { { 'a', 'b', 'c', 'e' }, { 's', 'f', 'c', 's' }, { 'a', 'd', 'e', 'e' } };
        String str = "abcced";
        String p = "";

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                helper(ok, board, p, str, str.length(), i, j);

            }

        }

        // /"",word,maze,board,word.length()
        System.out.println("helloo" + p);
    }

    private static void helper(boolean[][] ok, char[][] board, String p, String str, int length, int r, int c) {
        if (length == 0) {
            if (p.equals(str)) {
                System.out.println(p);
            }
            return;
        }

        if (ok[r][c])
            return;

        ok[r][c] = true;

        if (r < board.length - 1)
            helper(ok, board, p + board[r][c], str, length - 1, r + 1, c);
        if (c < board[0].length - 1)
            helper(ok, board, p + board[r][c], str, length - 1, r, c + 1);
        if (r > 0)
            helper(ok, board, p + board[r][c], str, length - 1, r - 1, c);
        if (c > 0)
            helper(ok, board, p + board[r][c], str, length - 1, r, c - 1);

        ok[r][c] = false;
    }

}

// real solution-----------------------------------------
// class Solution {
// public boolean exist(char[][] board, String word) {
// int row = board.length;
// int col = board[0].length;
// for (int i=0;i<row;i++){
// for (int j=0;j<col;j++){
// if (board[i][j]==word.charAt(0)) {
// if (faster(board,word,0,i,j,row,col,new boolean[row][col]))return true;
// }}
// }
// return false;
// }
// private static boolean faster(char[][] board, String word, int index, int
// sourceX,
// int sourceY, int row, int col,boolean[][] tracker){
// if (index==word.length()-1)return true;

// tracker[sourceX][sourceY]=true;
// //Left
// if (sourceY>0 && !tracker[sourceX][sourceY-1] &&
// board[sourceX][sourceY-1]==word.charAt(index+1)
// && faster(board,word,index+1,sourceX,sourceY-1,row,col,tracker))return true;

// //Right
// if (sourceY<col-1 && !tracker[sourceX][sourceY+1] &&
// board[sourceX][sourceY+1]==word.charAt(index+1)
// && faster(board,word,index+1,sourceX,sourceY+1,row,col,tracker))return true;
// //Up
// if (sourceX>0 && !tracker[sourceX-1][sourceY] &&
// board[sourceX-1][sourceY]==word.charAt(index+1)
// && faster(board,word,index+1,sourceX-1,sourceY,row,col,tracker))return true;
// //Down
// if (sourceX<row-1 && !tracker[sourceX+1][sourceY] &&
// board[sourceX+1][sourceY]==word.charAt(index+1)
// && faster(board,word,index+1,sourceX+1,sourceY,row,col,tracker))return true;

// tracker[sourceX][sourceY]=false;
// return false;
// }
// }

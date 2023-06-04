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
                if (p.equals(str))
                    break;
            }
        }

        // /"",word,maze,board,word.length()

    }

    private static void helper(boolean[][] ok, char[][] board, String p, String str, int length, int r, int c) {
        if (length == 0) {
            if (p.equals(str)) {
                System.out.println(p);
            } else
                return;
        }

        if (ok[r][c])
            return;

        ok[r][c] = true;

        if (length > 0) {

            if (r < board.length)
                helper(ok, board, p + board[r][c], str, length - 1, r + 1, c);
            if (c < board[0].length)
                helper(ok, board, p + board[r][c], str, length - 1, r, c + 1);
            if (r > 0)
                helper(ok, board, p + board[r][c], str, length - 1, r - 1, c);
            if (c > 0)
                helper(ok, board, p + board[r][c], str, length - 1, r, c - 1);
        }

        ok[r][c] = false;
    }

}

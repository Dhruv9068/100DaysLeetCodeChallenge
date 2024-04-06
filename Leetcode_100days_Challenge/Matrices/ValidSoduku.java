package first_ideaprogram.src.Leetcode_100days_Challenge.Matrices;
import java.util.*;
public class ValidSoduku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));


    }
        static boolean isValidSudoku(char[][] board) {
            HashSet<String> seen = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char num = board[i][j];
                    if (num != '.') {

                        String keyRow = num + " in row " + i;
                        String keyCol = num + " in column " + j;
                        String keySubgrid = num + " in subgrid " + i / 3 + "-" + j / 3;
                        if (!seen.add(keyRow) || !seen.add(keyCol) || !seen.add(keySubgrid)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }


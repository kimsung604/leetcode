package easy.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] input = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(input));
    }

    private static boolean isValidSudoku(char[][] board) {
        Set<String> validSet = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char sudoku = board[i][j];

                if (sudoku == '.') {
                    continue;
                }

                if (!validSet.add("row" + i + sudoku)) {
                    return false;
                }

                if (!validSet.add("column" + j + sudoku)) {
                    return false;
                }

                if (!validSet.add("boxes" + i / 3 + j / 3 + sudoku)) {
                    return false;
                }
            }
        }

        return true;
    }
}

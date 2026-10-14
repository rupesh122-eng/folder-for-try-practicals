// Write a program to solve a Sudoku puzzle by filling the empty cells.
public class Suduko_solver {

    public static boolean solve(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) { // Find an empty cell
                    for (int num = 1; num <= 9; num++) { // Try numbers 1-9
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place the number
                            if (solve(board)) { // Recursively try to solve the rest
                                return true;
                            }
                            board[row][col] = 0; // Backtrack if not solvable

                        }
                    }
                    return false; // No valid number found, trigger backtracking
                }
            }
        }
        return true; // Solve
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if 'num' is not in the current row and column
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false;
            }

            // Check if 'num' is not in the current 3x3 subgrid
            int startRow = row - row % 3;
            int startCol = col - col % 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i + startRow][j + startCol] == num) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(board[r][d] + " | ");
            }
            System.out.println();
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }

        };
        if (printBoard(board)) {
            System.out.println("Solution exists: ");
        } else {
            System.out.println("Solution does not exist.");
        }

        if (solve(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }

    }

}
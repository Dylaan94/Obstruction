public class Board {
    private int height;
    private int width;
    private String[][] board;
    private boolean win;

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new String[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = "*";
            }
        }
        win = false;
    }

    public String getBoard() {
        String str = "";
        for (int i = 0; i < height; i++) {
            str += (i + 1 + " | ");
            for (int j = 0; j < width; j++) {
                str += (board[i][j] + "  ");
            }
            str += "\n";
        }
        str += "    ";
        for (int i = 0; i < width; i++) {
            str += i + 1 + "  ";
        }
        return str;
    }

    public boolean placeToken(int row, int col, String initial) {
        if (isLegalMove(row,col)) {
            board[row][col] = initial;
            placeBlockedCells(row,col);
            return true;
        } else {
            return false;
        }
    }

    public void placeBlockedCells(int row, int col) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (inBound(row + i, col + j)) {
                    if (board[row+i][col+j].matches("[a-zA-Z]")) {
                        continue;
                    }
                    board[row+i][col+j] = "/";
                }

            }
        }
    }

    public boolean isLegalMove(int row, int col) {
        if (inBound(row,col)) {
            if (board[row][col].equals("/")) {
                System.out.println("Illegal move (boundary placement) please try again");
                return false;
            } else if (board[row][col].equals("D")) {
                System.out.println("Illegal move (position already taken) please try again");
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean inBound(int row, int col) {
        return (0 <= row && row < board.length) && (0 <= col && col < board[row].length);
    }

    public boolean hasWon() {
        return win;
    }
}

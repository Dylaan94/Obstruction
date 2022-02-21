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

    public void placeToken(int row, int col, String initial) {
        this.board[row][col] = initial;
    }

    public boolean hasWon() {
        return win;
    }
}

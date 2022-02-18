public class Board {
    private int height;
    private int width;
    private String[][] board;

    public Board (int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new String [height][width];
    }

    // argumentless constructor
    public Board() {

    }

    public String getBoard() {
        String str = "";

        for (int i = 0; i < height; i++) {
            str += (i + 1 + " | ");
            for (int j = 0; j < width; j++) {
                str += " * ";
            }
            str += "\n";
        }
        str += "     ";
        for (int i = 0; i < width; i++) {
            str += i + 1 + "  ";
        }

        return str;
    }

}

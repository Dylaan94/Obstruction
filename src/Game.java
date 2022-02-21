public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(int height, int width, String intial1, String initial2) {
        player1 = new Player(intial1);
        player2 = new Player(initial2);
        board = new Board(height, width);
    }

    public void playGame() {
        System.out.println(board.getBoard());
        Player player = player1;
        boolean success;
        while (!board.hasWon()) {
            Move move = player.getMove();
            success = board.placeToken(move.getRow() - 1, move.getCol() - 1, player.getInitial());
            System.out.println(board.getBoard());

            if (success){
                if (player.equals(player1)) {
                    player = player2;
                } else {
                    player = player1;
                }
            }
        }
    }
}

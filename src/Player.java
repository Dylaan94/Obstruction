import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    private String initial;
    private BufferedReader input;

    public Player (String inital) {
        this.initial = inital;
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public void setPlayer() {
        try {
            this.initial = input.readLine();
        } catch (IOException e) {

        }
    }

    public Move getMove() {
        String row = "";
        String col = "";

        try {
            row = input.readLine();
            col = input.readLine();
        } catch (IOException e) {

        }
        return new Move(Integer.parseInt(row), Integer.parseInt(col));
    }

    public String getInitial(){
        return initial;
    }



}

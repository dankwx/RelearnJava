import java.util.ArrayList;

public class TicTacToe {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ticTacToe = new ArrayList<>();

        ArrayList<String> leftColumn = new ArrayList<>();
        leftColumn.add("-");
        leftColumn.add("-");
        leftColumn.add("-");

        ArrayList<String> middleColumn = new ArrayList<>();
        middleColumn.add("-");
        middleColumn.add("-");
        middleColumn.add("-");

        ArrayList<String> rightColumn = new ArrayList<>();
        rightColumn.add("-");
        rightColumn.add("-");
        rightColumn.add("-");

        ticTacToe.add(leftColumn);
        ticTacToe.add(middleColumn);
        ticTacToe.add(rightColumn);


        for (int i = 0; i < ticTacToe.get(0).size(); i++) {
            System.out.println(ticTacToe.get(0).get(i));
        }
    }
}

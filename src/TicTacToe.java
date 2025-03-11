import java.util.ArrayList;

public class TicTacToe {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ticTacToe = new ArrayList<>();

        ArrayList<String> leftColumn = new ArrayList<>();
        leftColumn.add(" a |");
        leftColumn.add(" b |");
        leftColumn.add(" c ");

        ArrayList<String> middleColumn = new ArrayList<>();
        middleColumn.add(" d |");
        middleColumn.add(" e |");
        middleColumn.add(" f ");



        ArrayList<String> rightColumn = new ArrayList<>();
        rightColumn.add(" j |");
        rightColumn.add(" k |");
        rightColumn.add(" l ");

        ticTacToe.add(leftColumn);
        ticTacToe.add(middleColumn);
        ticTacToe.add(rightColumn);


        for (int i = 0; i < ticTacToe.get(0).size(); i++) {
            System.out.print(ticTacToe.get(0).get(i));
        }
        System.out.println("");
        for (int j = 0; j < ticTacToe.get(1).size(); j++) {
            System.out.print(ticTacToe.get(1).get(j));
        }
        System.out.println("");
        for (int k = 0; k < ticTacToe.get(2).size(); k++) {
            System.out.print(ticTacToe.get(2).get(k));
        }
    }
}

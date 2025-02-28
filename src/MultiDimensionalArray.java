import java.util.ArrayList;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> nameAndSurname = new ArrayList<>();

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Daniel");
        nomes.add("Daniel 2");

        nameAndSurname.add(nomes);

        ArrayList<String> sobrenome = new ArrayList<>();

        sobrenome.add("Kondlatsch");
        sobrenome.add("Kondlatsch 2");

        nameAndSurname.add(sobrenome);

        System.out.println(nameAndSurname.get(0).get(1) + nameAndSurname.get(1).get(0));
    }
}

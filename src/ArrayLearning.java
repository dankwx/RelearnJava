import java.util.ArrayList;
import java.util.List;

public class ArrayLearning {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<String>();

        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Amarelo");

        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }
    }
}

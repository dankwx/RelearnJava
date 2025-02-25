public class LoopBasic {
    ;

    static void printForLoop() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Print de um method do Java" + i);
        }
    }

    static void printWhileLoop() {
        int repeat = 0;
        while (repeat <= 3) {
            System.out.println("While repeat" + repeat);
            repeat++;
        }


    }

    public static void main(String[] args) {
        // printForLoop();
        printWhileLoop();
    }
}
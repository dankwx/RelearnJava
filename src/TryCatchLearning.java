public class TryCatchLearning {
    public static void main(String[] args) {
        boolean error = false;
        try {
            System.out.println(100 / 0); // force exception
        } catch (Exception e) {
            System.out.println("Erro:");
            System.out.println(e.getMessage());
            error = true;
        } finally {
            if (error) {
                System.out.println("Favor tente novamente");
            } else {
                System.out.println("TUdo certo!");
            }

        }
    }
}

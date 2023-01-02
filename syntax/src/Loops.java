public class Loops {
    public static void main(String[] args) {
        int counter = 1;

        // Quando não souber quantas vezes precisa executar
        // while (counter <= 10) {
        //     System.out.println(counter);
        //     counter++;
        // }

        // Quando tiver uma quantidade de execuções definidadas
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(counter);
        //     counter++;
        // }

        // Loops Aninhados e Liagação de Loops
        // Break interrompe e pula a execução do loop mais interno mas a execução dos loops mais externos continuam
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if(col > row) {
                    break;
                }

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
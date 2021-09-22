
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int tab[] = new int[11];

        int multiplicacao = 0;

        System.out.println("Digite o número da tabuada : ");
        multiplicacao = entrada.nextInt();

        for (int i = 1; i <= tab.length; i++) {
        }

        for (int i = 1; i <= tab.length; i++) {

            tab[i] += i;

            System.out.print(i + " x " + multiplicacao + " = ");
            System.out.println(i * multiplicacao);
            System.out.println("________________________");

        }

    }

}

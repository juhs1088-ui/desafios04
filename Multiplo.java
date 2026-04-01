package IF;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        double a;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        a = ler.nextDouble();

        System.out.println("O número " + a + (a % 5 == 0 ? " é multiplo de 5" : " não é multiplo de 5"));

        ler.close();
    }
}



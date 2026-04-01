package IF;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.print("Informe primeira nota ");
        nota1 = ler.nextDouble();

        System.out.print("Informe segunda nota ");
        nota2 = ler.nextDouble();

        System.out.print("Informe terceira nota ");
        nota3 = ler.nextDouble();

        System.out.print("Informe quarta nota ");
        nota4 = ler.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println((media >= 6 ? "Aprovado " : "Reprovado ") + media);

        ler.close();
    }
}


package IF;

import java.util.Random;
import java.util.Scanner;

public class Penalti {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int jogador;
        int goleiro;

        System.out.println("Escolha onde quer chutar:");
        System.out.println("1 - Esquerda");
        System.out.println("2 - Meio");
        System.out.println("3 - Direita");

        jogador = ler.nextInt();

        goleiro = random.nextInt(3) + 1;

        System.out.println("Você chutou: " + jogador);
        System.out.println("Goleiro foi para: " + goleiro);

        if (jogador != goleiro) {
            System.out.println("GOOOOL! ");
        } else {
            System.out.println("DEFENDEU! ");
        }

        ler.close();
    }
}


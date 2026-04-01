package IF;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random ale = new Random();

		int numAle, numDig;

		System.out.println("Informe um número de 1 a 10: ");
		numDig = ler.nextInt();
		ler.close();

		numAle = ale.nextInt(10) + 1;

		if (numAle == numDig) {
			System.out.println("Parabéns você acertou!!!");
		} else {
			System.out.println("Infelizmente você errou, o número era: " + numAle);

		}
	}
}

package IF;

import java.util.Random;

public class sorteador {
	public static void main(String[] args) {

		// ENTRADA
		int numAlu;

		Random aleatorio = new Random();

		// PROCESSAMENTO

		numAlu = aleatorio.nextInt(30) + 1;

		// SAIDA

		System.out.println(numAlu);
	}
}
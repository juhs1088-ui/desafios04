package IF;

import java.util.Random;

public class simulador {
	public static void main(String[] args) {

		// ENTRADA
		int num;

		Random aleatorio = new Random();

		// PROCESSAMENTO

		num = aleatorio.nextInt(6) + 1;

		// SAIDA

		System.out.println(num);
	}

}

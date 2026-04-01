package IF;

import java.util.Random;
import java.util.Scanner;

public class Peso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        Random random = new Random();
		
		int peso;
		
	System.out.println("Qual o seu peso? ");
	peso= ler.nextInt();

	if (peso <= 52.2) {
		System.out.println("Peso palha");
	}
	else if (peso  <=56.7 ) {
		System.out.println("Peso mosca");
	}
	else if (peso >=56.8 && peso <=61.2 ) {
		System.out.println("peso galo");
	}
	else if (peso >=61.3 && peso <=65.8 ) {
		System.out.println("peso pena");
	}
	else if (peso >= 65.9 && peso <=70.3 ) {
		System.out.println("peso leve");
	}
	else if (peso >= 70.4 && peso <=77.1 ) {
		System.out.println("peso meio-médio");
	}
	else if (peso >= 77.2 && peso <=83.9 ) {
		System.out.println("peso médio");
	}
	else if (peso >= 84.0 && peso <=93.0 ) {
		System.out.println("peso Médio-Pesado");
	}
	else  {
		System.out.println("Peso pesado");
	}
}
}

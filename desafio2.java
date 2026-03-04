package IF;

import java.util.Scanner;

public class desafio2 {
	public static void main(String[] args) {

		// ENTRADA
		int dia;

		Scanner guardar = new Scanner(System.in);

		System.out.println("Informe o dia da semana: ");
		dia = guardar.nextInt();

		if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("segunda");
		} else if (dia == 3) {
			System.out.println("terça");
		} else if (dia == 4) {
			System.out.println("Quarta");
		} else if (dia == 5) {
			System.out.println("Quinta");
		} else if (dia == 6) {
			System.out.println("Sexta");
		} else if (dia == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Dia Inválido!!!");
		}

		guardar.close();

	}
}

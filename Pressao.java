package IF;

import java.util.Scanner;

public class Pressao {
	public static void main(String[] args) {
		int pressao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a pressao: ");
		pressao= ler.nextInt();
		
		if (pressao <60) {
			System.out.println("Fraca");
		}
		else if (pressao <90) {
			System.out.println("Ideal");
		}
		else if (pressao <100) {
			System.out.println("Ideal");
		}
		else if (pressao <110) {
			System.out.println("Alta");
		}
		else {
			System.out.println("Vai explodir!! ");
		}
			ler.close();
	}
}
		

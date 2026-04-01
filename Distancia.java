package IF;

import java.util.Scanner;

public class Distancia {
	public static void main(String[] args) {
		int distancia;
		
		Scanner ler= new Scanner(System.in);
		System.out.println("Informe o grau: ");
		distancia= ler.nextInt();
		ler.close();
		
		if (distancia <55) {
			System.out.println("Boa distancia!");
		}
		else if (distancia ==45) {
			System.out.println("Distancia máxima");
		}
		else if (distancia <=44) {
			System.out.println("Boa distancia");
		}
		else {
			System.out.println("Baixa distancia");
		}

}
}
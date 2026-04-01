package IF;

import java.util.Scanner;

public class competicao {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int distancia;

		System.out.println("Informe a distancia do lançamento");
		distancia = ler.nextInt();
		
		if (distancia <50) {
			System.out.println("Sem medalha");
		
		}else if (distancia >=50 && distancia <=99) {
			System.out.println("Ganhou medalha de bronze.");
		
		}else if (distancia >=100 && distancia <=149) {
		System.out.println("Ganhou medalha de prata.");
		
		}else if (distancia >=150){
			System.out.println("Ganhou medalha de ouro.");
			
			ler.close();
		}
	}
}

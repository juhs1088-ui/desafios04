package IF;

import java.util.Random;
import java.util.Scanner;

public class Personagem {
	public static void main(String[] args) {
		Random random =new Random();
	Scanner ler= new Scanner(System.in);
			
		String personagem;
		int pontuacao;
		
		System.out.println("Qual o nome do seu personagem? ");
		personagem= ler.next();
		System.out.println("Qual a pontuação? ");
		pontuacao = ler.nextInt();
	
		
		if (pontuacao >=1 && pontuacao <=20 ) {
			System.out.println("iniciante");
		}
		else if (pontuacao >=21 && pontuacao <=50 ) {
			System.out.println("Guerreiro");
		}
		else if (pontuacao >=51 && pontuacao <=80 ) {
			System.out.println("Elite");
		}
		else if (pontuacao >= 81 && pontuacao <=100 ) {
			System.out.println("Lendário");
		}
		else  {
			System.out.println("erro");
			ler.close();
		}

	}
}

package IF;

import java.util.Scanner;

public class mistura {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double porcentagem = 0;
		double agua;
		double capacidade = 2000;
		
		
		System.out.println("Informe a quantidade de água que tem no foguete: ");
		agua = ler.nextInt();
		
		System.out.println("Informe a capcidade da garrafa: ");
		capacidade = ler.nextInt();
		
		ler.close();
		
		porcentagem = (agua/capacidade) * 100;
		
		if (porcentagem <20) {
			System.out.println(porcentagem);
			System.out.println("Adicione mais água.");
			
		}else if (porcentagem >60) {
			System.out.println(porcentagem);
			System.out.println("O foguete está muito pesado.");
		
		}else if (porcentagem <60) {
			System.out.println(porcentagem);
			System.out.println("A quantidade está adequada!");
		}
	}

}

package IF;

import java.util.Scanner;

public class desafio1 {
	
	public static void main(String[] args) {
		
		//ENTRADA
		double n1, n2, n3, n4;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a priemira nota: ");
		n1 = ler.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		n2 = ler.nextDouble();
		 
		System.out.println("Informe a terceira nota: ");
		n3 = ler.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		n4 = ler.nextDouble();
		
		ler.close();
		
		//PROCESSAMENTO
		double media = (n1+n2+n3+n4)/4;
		
		//SAIDA
		if( media >=6) {
			System.out.println("A media é: " +media  +"Aprovado");
		} else {
			System.out.println("A media é: " + media +"Reprovado");
		}
	}

}

package IF;

import java.util.Random;

public class Nascimento {
public static void main(String[] args) {
	Random nasc = new Random();
	
	int nascimento = nasc.nextInt();
	
	System.out.println("Qual ano você nasceu? ");
	nascimento= nasc.nextInt((2026 - 1946) + 1) + 1946;
	
	System.out.println(nascimento);
	
	if (nascimento >= 1946 && nascimento <= 1964) {
		System.out.println("Você é da geração baby boomer");
	}
	else if (nascimento >= 1965 && nascimento <= 1980) {
		System.out.println("Você é da geração X");
	}
	else if (nascimento >= 1981 && nascimento <= 1996) {
		System.out.println("Você é da geração Millennials ou Geração Y");
	}
	else if (nascimento >= 1997 && nascimento <= 2010) {
		System.out.println("Você é da geração Z");
	}
	else  {
		System.out.println("Você é da geração Alpha");
	}
	
}
}

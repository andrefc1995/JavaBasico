package br.com.desafio;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Opcoes c = new Opcoes();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha um número de 1 a 3!");
		int numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println(c.selecionarOpcao1());
			break;

		case 2:
			System.out.println(c.selecionarOpcao2();
			break;
			
		case 3:
			System.out.println(c.selecionarOpcao3();
			break;
		
	}
}
}
package br.com.desafio;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Impressora.imprimaValor("Escolha um número de 1 a 3, ou 0 para sair");
		int numero = sc.nextInt();
		Opcoes c = new Opcoes();
		int idade = 0;
		do {
			numero = escolherOpcao(sc);
			switch (numero) {
			case 1:
				c.selecionarOpcao1();
				break;

			case 2:
				idade = c.selecionarOpcao2();
				break;

			case 3:
				c.selecionarOpcao3(idade);
				break;
			default:
				Impressora.imprimaValor("Você não selecionou um opção");
				break;
			}
			
		}while (numero != 0) ;
	}
	public static int escolherOpcao(Scanner sc) {
		Impressora.imprimaValor("Escolha um número de 1 a 3, ou 0 para sair");
		return sc.nextInt();
	}
}
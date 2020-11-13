package br.com.desafio;

import java.util.Scanner;

public class Opcoes {
	public void selecionarOpcao1() {
		String controle = "C";
		while (controle != "gato") {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o nome do seu animal favorito? ");
		String animal = sc.nextLine();
		if (animal == "gato") {
			System.out.println("Que legal o meu também");
		} else {
			System.out.println("Eu prefiro gato..");
		} 
	}
}
	int idade;
	public void selecionarOpcao2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a idade do seu filho? ");
		int idade = sc.nextInt();
		if (idade < 0 && idade > 12) {
			System.out.println("Ele ainda é uma criança");
		} else if (idade < 1 && idade > 19) {
			System.out.println("Adolescência é fogo..");				
		} else if (idade > 18) {
			System.out.println("Ele já é um adulto!");
		}
	}

	public void selecionarOpcao3() {
		System.out.print("Em construção será que vamos aprender a usar o for..");
	}
}

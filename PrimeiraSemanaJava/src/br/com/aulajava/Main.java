/**
 * 
 */
package br.com.aulajava;

import java.util.Date;
import java.util.Scanner;

/**
 * @author tec46
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora c = new Calculadora();

//		System.out.println(c.realizarMultiplicacao(10));

//		System.out.println(c.realizaSoma(10));

//		System.out.println(Calculadora.valorPadraoSomaInteiro);

		byte b;
		short s = 32; // - 32000 até 32000
		int i = 30; // - 2147483648 até 214783648
		long l = 201; // -
		float f = 10.3443f; // 6
		double d = 12.343d; // 15
		boolean bol = true; // valores true e false
		char ch = 'A'; // 'a'

//		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		
		float numF = sc.nextFloat();
		System.out.println(numF);
		int num1 = sc.nextInt();
		System.out.println(num1);
		byte byte1 = sc.nextByte();
		System.out.println(byte1);
		long lg1 = sc.nextLong();
		System.out.println(lg1);
		boolean b1 = sc.nextBoolean();
		System.out.println(b1);
		double num2 = sc.nextDouble();
		System.out.println(num2);
		String nome = sc.nextLine();
		System.out.println(nome);
		
		
	}

}

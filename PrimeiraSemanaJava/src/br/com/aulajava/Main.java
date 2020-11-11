/**
 * 
 */
package br.com.aulajava;

import java.util.Date;

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

		System.out.println(c.realizarMultiplicacao(10));

		System.out.println(c.realizaSoma(10));

		System.out.println(Calculadora.valorPadraoSomaInteiro);

		byte b;
		short s = 32; // - 32000 até 32000
		int i = 30; // - 2147483648 até 214783648
		long l = 201; // -
		float f = 10.3443f; // 6
		double d = 12.343d; // 15
		boolean bol = true; // valores true e false
		char ch = 'A'; // 'a'

		System.out.println(ch);
	}

}

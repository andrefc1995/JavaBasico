/**
 * 
 */
package br.com.aulajava;

/**
 * @author tec46
 *
 */
public class CalcularSalario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//

		float salariobase = 1546.3f;
		float valorvendas = 1400.55f;
		double percentual = valorvendas / 100;
		double comissao = salariobase + (percentual * salariobase);
		double salariofinal = comissao + salariobase;
		System.out.println(salariofinal);

	}

}

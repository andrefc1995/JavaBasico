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
		double percentual = 10 / 100;
		double comissao = percentual * valorvendas;
		double salariofinal = comissao + salariobase;
		System.out.println(salariofinal);

	}

}

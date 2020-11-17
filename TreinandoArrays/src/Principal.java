import java.util.Scanner;

/**
 * 
 */

/**
 * @author tec46
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] nomes = { "Marcus", "Renata", "Janaina", "Patricia", "Samuel" };

		int[] idades = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + " tem " + idades[i]);
		}
		Scanner sc = new Scanner(System.in);
		int controle = 0;
		
		boolean verificador = false;
		for (String nome : nomes) {
			if (controle % 2 == 0) {
				System.out.println("O nome "+nome+ " está sendo alterado, informe o novo valor:");
				nome = sc.nextLine();
				System.out.println(nome);
				nomes[controle] = nome;
			}
			controle++;
		}
		controle = 0;
		for (int idade : idades) {
			if (controle % 2 != 0) {
				System.out.println("A idade " + idade + " está sendo alterada, informe o novo valor:");
				idade = sc.nextInt();
				System.out.println(idade);
				idades[controle] = idade;
			}
			controle++;
		}
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + " tem " + idades[i]);
		}
	}
}
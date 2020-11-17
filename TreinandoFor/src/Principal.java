
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		
		String textob = "Marcus, Fabiano, Icaro, Renata";
		String [] nomes = textob.split(",");
		for (String i : nomes) {
			System.out.println(i);
		}
		
		for (int i = 0; i < texto.length(); i++) {
			if(i == 8) {
				System.out.println("O tamanho da String é maior que 10");
			}
			System.out.println(texto.substring(i, (i + 1)));
			if (texto.substring(i, (i + 1)).toLowerCase().equals("a") && (i + 2) < texto.length()) {
				i = i + 2;
			}
		}
		int controleAchouA = 0;
		for(String a: texto.split("") ) {
			if (controleAchouA == 0) {
				System.out.println(a);
			}else {
				controleAchouA--;
			}
			if(a.toLowerCase().contains("a")) {
				controleAchouA = 2;
			}
		}
		for (String a: texto.split("")) {
			if(a.toLowerCase().contains("b")) {
				System.out.println("Encontrei um b");
				break;
			}
			System.out.println("Não encontrei um b");
		}		
	}
}

package estrutura_sequencial_exercicios;
import java.util.Scanner;
public class _07_estrutura_condicional_composta {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String bd, bt, bn;
		System.out.println("Que hora é agora? (ex. 9, 13, 19 - sem os minutos)");
			int x = leia.nextInt();
			
		//Estrutura Condicional Composta (if else) a simples usa apenas "if", por exemplo.
		if (x <= 12) {
			System.out.println("Bom dia!");
		}else if (x <= 18) {
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
		
		
		
		leia.close();
	}

}

package estrutura_sequencial_exercicios;
import java.util.Scanner;

/* o método nextLine() você pode digitar String numa linha utilizando espaços que funciona normalmente.
 Este método permite ler uma linha toda, incluindo espaços.*/

public class _04_exercicio_nextLine {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String a, b, c;
		
		//leia.nextLine();
		a = leia.nextLine();
		b = leia.nextLine();
		c = leia.nextLine();
		
		System.out.println("Valores foram:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		leia.close();
	}
	

}

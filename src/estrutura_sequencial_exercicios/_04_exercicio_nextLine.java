package estrutura_sequencial_exercicios;
import java.util.Scanner;

/* o m�todo nextLine() voc� pode digitar String numa linha utilizando espa�os que funciona normalmente.
 Este m�todo permite ler uma linha toda, incluindo espa�os.*/

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

package estrutura_sequencial_exercicios;
import java.util.Scanner;

public class _05_Operacoes_matematicas {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a "+ y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = "+ C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		System.out.println("\nBáskara e Deta: \n");
		System.out.println("Quais são as raízes reais da equação x2 – x = 6? \n");
		
		double delta, delta2, baskara, x1, x2, b=1, a=1, c=6;
		// primeiro tenho que saber o valor de delta.
		delta = (Math.pow(b, 2.0) - (- 4*a*c)); System.out.println("1- Delta: "+ delta);

		x1 = ( (-b + Math.sqrt(delta) ) ) / (2.0 * a);
		x2 = ( (-b - Math.sqrt(delta) ) ) / (2.0 * a);
		System.out.println("Resultado: X1 = " + x1 + " / X2 = " + x2);
		

		
	leia.close();
	}

}

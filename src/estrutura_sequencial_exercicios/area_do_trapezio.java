package estrutura_sequencial_exercicios;

public class area_do_trapezio {
	
	public static void main(String[] args) {
		double b = 6.0; //base menor
		double B = 8.0; //base maior
		double h = 5.0; //altura
		double area = 0;
		
		area = (b + B) / 2 * h;
		
		System.out.printf("A área do trapézio é: %.2f	", area);
		//Para calcular a área do trapézio a fórumla é: "área = (b + B)/2 * h"
		
		
	}

}

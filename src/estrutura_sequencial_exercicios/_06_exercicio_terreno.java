package estrutura_sequencial_exercicios;
import java.util.Locale;
import java.util.Scanner;

public class _06_exercicio_terreno {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = leia.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = leia.nextDouble();
		
		System.out.println("Digite o preço do metro quadrado: ");
		double preco = leia.nextDouble();
		
		double area = largura * comprimento;
		double valorTotal = area*preco;
		
		System.out.printf("\n"+"Largura: %.2f\nComprimento: %.2f\nPreço do metro²: R$%.2f\n",largura,comprimento,preco);
		System.out.printf("Área total:  %.2f\nValor do Terreno: %.2f",area,preco);
		
		
		leia.close();
	}

}

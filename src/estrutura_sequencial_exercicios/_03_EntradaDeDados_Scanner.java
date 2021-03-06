package estrutura_sequencial_exercicios;
import java.util.Locale;
import java.util.Scanner;

public class _03_EntradaDeDados_Scanner {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); // para uso da classe Scanner foi necess�rio import�-la no java.util.
		int a=0;
		String b="0", escolha;
		double c=0, d=0;
		
		System.out.println("Digite seu nome em seguida o nome de sua cidade.");
		String nome = leia.nextLine();
		String cidade = leia.nextLine();
		
		System.out.println("O cursor estar� esperando um valor inteiro 'NomeDoScanner.nextInt()'");
		a = leia.nextInt();
		
		System.out.println("O cursor estar� esperando uma String 'NomeDoScanner.next()'");
		b = leia.next();
	
		System.out.println("Voc� digitar� n�mero double agora. Para formato Brasileiro pressione ',' (v�dgula), para americano pressione '.'(ponto):");
		escolha = leia.next();
		
		if (escolha.equals(",")) {
			
			System.out.println("Digite um Double (2,45 - formato 'PT', 'Brasil') 'NomeDoScanner.nextDouble()'");
			Locale.setDefault(new Locale("pt","Brasil"));
			c = leia.nextDouble();	
			System.out.printf("%nValor inteiro digitado foi %d %nString digitada foi %s. %nValor double (PT BR) foi: %.2f",a,b,c);
			
		} else if(escolha.equals(".")) {
		
			System.out.println("O cursor estar� esperando um n�mero Double (2,45 - formato 'en', 'US') use v�rgula, ser� mostrado com ponto (.)");
			d = leia.nextDouble();
			Locale.setDefault(new Locale("en", "US")); // N�o est� dando certo capturar o dado separado por ponto. Captura com ',' e mostra com '.'!
			System.out.printf("%nValor inteiro digitado foi %d %nString digitada foi %s %nValor double (EN USS) foi: %.2f",a,b,d);
			
			} else {
				System.out.println("Voc� digitou o valor incorreto.");
			}

		System.out.printf("%nSeu nome �: %s%nSua cidade �: %s%nFim.", nome, cidade);
		
		leia.close();
	}

}

package estrutura_sequencial_exercicios;
import java.util.Locale;

public class _01_saidaDeDadosJava {


	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %s, which price is $ %.2f %n%s, which price is $ %.2f %n", product1, price1, product2, price2);
		System.out.printf("%nRecord: %d years old, code %s and gender: %s.%n", age, code, gender);
		
		Locale.setDefault(new Locale("pt", "Brasil"));
		System.out.printf("%nMeasure with eirght decimal places: %.8f%n", measure);
		System.out.printf("Rouded (threee decimal places): %.3f%n", measure);
		
		Locale.setDefault(new Locale("en", "US"));
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}

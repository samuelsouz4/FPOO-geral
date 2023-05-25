import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double C, F;
		
		System.out.println("Convertedor de Temperadora");
		
		System.out.println("Informe o Celsius: ");
		C = scanner.nextDouble();
		
		F = (C * 1.8 + 32);
		
		System.out.println("resultado da Conversão do Fahrenheit: "+ F);
		
		System.out.println("---- Obrigado por acessar nosso Site");
		
		
		
		

	}

}

package decimaltobinary;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int decimal;
		String binario;
		
		System.out.println("Digite o n�mero Decimal: ");
		decimal = scanner.nextInt();
		
		binario = Integer.toBinaryString(decimal);
		
		System.out.println("O n�mero decimal �: " + decimal);
		System.out.println("Valor decimal convertido em Bin�rio: " + binario);
		
			
		
	}
	
	
	
	
	
}

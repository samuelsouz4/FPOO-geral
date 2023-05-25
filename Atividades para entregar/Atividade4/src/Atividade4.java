import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double A1, B1, A2, B2;
		
		System.out.println("Bem-Vindo ao programa de troca de valores");
		
		System.out.println("Informe o Valor A: ");
		A1 = scanner.nextDouble();
		
		System.out.println("Informe o Valor B: ");
		B1 = scanner.nextDouble();
		
		B2 = A1;
		
		A2 = B1;
		
		
		System.out.println("Aqui está o valor A: " + A2);
		
		System.out.println("Aqui está o valor B: " + B2);
		
				
	}

}

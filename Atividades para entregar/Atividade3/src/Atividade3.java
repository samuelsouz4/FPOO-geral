import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double T, V, D, L;
		
		System.out.println("Distancia");
		
		System.out.println("Informe o Tempo:");
		T = scanner.nextDouble();
		
		System.out.println("Informe a Velocidade: ");
		V = scanner.nextDouble();
		
		D = V * T;
		
		L = D/12;
		
		System.out.println("Distância: " + D);
		System.out.println("Litros: " + L);
		
		System.out.println("---Obrigado por acessar nosso site---");
		
		
		
		
		
		
		
		

	}

}

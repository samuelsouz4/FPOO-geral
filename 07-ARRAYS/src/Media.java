import java.util.Scanner;

public class Media {
	
	String [] nomes = new String [10];
	Scanner objScanner = new Scanner(System.in);
	
		public void listarAlunos() {
		
		int cont =0;
		while(cont < nomes.length) {
		
			System.out.println("digite o nome");
			nomes[cont] = objScanner.next();
			cont++;
		}

		
		for (int indice = 0; indice < nomes.length; indice++) {
	System.out.println("nomes do aluno" + nomes [indice]);
		}
				
	System.out.println("total de alunos " + nomes.length);

		}
}

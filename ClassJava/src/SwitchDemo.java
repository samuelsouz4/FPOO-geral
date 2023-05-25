import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("--Opções--");
		System.out.println("1-Nome do Sistema Operacional");
		System.out.println("2-Arquitetura do Sistema Operacional");
		System.out.println("3-Versão do Sistema Operacional");
		System.out.println("4-Separador de Arquivos do Sistema Operacional");
		System.out.println("5-Separador de Linhas");
		System.out.println("6-Home do Usuario");
		System.out.println("7-Diretorion Corrente de Trabalho");
		
		Scanner scanner = new Scanner(System.in);
		
		

		int opcao = Scanner.nextInt();
		String monthString;
        switch (opcao) {

		case 1: monthString = ("Nome do Sistema Operacional: " + System.getProperty("os.names"));
        break;
        case 2: monthString = "Arquitetura do Sistema Operacional: " + System.getProperty("os.arch");
        break;
        case 3: monthString = "Versão do Sistema Operacional: " + System.getProperty("os.version");
        break;
        case 4: monthString = "Separador de Arquivos do Sistema Operacional: " + System.getProperty("file.separator");
        break;
        case 5: monthString = "Separador de Linhas " + System.getProperty("line.separator");
        break;
        case 6: monthString = "Home do Usuario: " + System.getProperty("user.home");
        break;
        case 7: monthString = "Diretorio Corrente de Trabalho: " + System.getProperty("user.dir");
        break;
        default: monthString = "Invalid Code";
        break;
        }
       System.out.println(monthString);
     }
	
}
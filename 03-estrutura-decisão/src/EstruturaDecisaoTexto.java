
public class EstruturaDecisaoTexto {
	
	//� vazio
	public void testeVazio(String texto) {
		if(texto.isEmpty()) {
			System.out.println("--Vc n�o digitou o texto. Por favor digite o texto--");
		}else {
			System.out.println("--Obrigado pela aten��o--");
		}
	}
	
	//� igual
	public void testeIgual(String texto1, String texto2) {
		if(texto1.equalsIgnoreCase(texto2)) {
			System.out.println("Os textos s�o iguais");
		}else {
			System.out.println("Os textos s�o diferentes");
		}
	}
	
	//qual o tamanho
	public void contador(String texto) {
		
		int tamanho = texto.length();
		
		if(tamanho >= 8) {
			System.out.println("A senha � valida");
		}else {
			System.out.println("A senha n�o � valida");
		}
	}

}

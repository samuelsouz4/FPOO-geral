
public class dadoContato {

private String email;
private String telefone;

	
//Email
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	
	if(email.isEmpty()) {
		System.out.println("Por favor Digite o Email");
		System.exit(0);
	}else {
		this.email = email;
	}
		
}


//Telefone
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	
	if(telefone.isEmpty()) {
		System.out.println("por favor digite sue numero de telefone");
		System.exit(0);
	}else {
		int tamanho = telefone.length();
		if(tamanho < 15) {
			System.out.println("digite o numero minimo de telefone");
			System.exit(0);
		}else {
			this.telefone = telefone;
		}
	}
	
}



}

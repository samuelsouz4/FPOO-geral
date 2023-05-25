
public class dadoEndereco {

	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	
	//Cep
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		
		if(cep.isEmpty()) {
			System.out.println("por favor digite o numero do cep");
			
		}else {
			int tamanho = cep.length();
			if(tamanho < 3) {
				System.out.println("digite o numero minimo do seu cep");
				System.exit(0);
			}else {
				this.cep = cep;
			}
		}
		
	}
	
	
	
	//Logradouro
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		
		if(cep.isEmpty()) {
			System.out.println("por favor digite o numero do seu logradouro");
			
		}else {
			int tamanho = cep.length();
			if(tamanho < 3) {
				System.out.println("digite o numero minimo do seu logradouro");
				System.exit(0);
			}else {
				this.logradouro = logradouro;
			}
		}
		
		this.logradouro = logradouro;
	}
	
	
	
	//Numero
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		
		if(numero.isEmpty()) {
			System.out.println("--Por favor colocar o numero da casa--");
			
		}else {
			int tamanho = numero.length();
			if(tamanho < 0) {
				System.out.println("por favor digitar o numero da casa");
				System.exit(0);
			}else {
				this.numero = numero;
			}
		}
		

	}
	
	
	
	//Bairro
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		
		if(bairro.isEmpty()) {
			System.out.println("por favor digite o nome do seu bairro");
			System.exit(0);
			
		}else {
			this.bairro = bairro;
		}
		
	}
	
	
	
	//Cidade
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		
		if(cidade.isEmpty()) {
			System.out.println("por favor digite o nome do seu bairro");
			System.exit(0);
			
		}else{
		    this.cidade = cidade;
		    
			}
	}
	
	
	
	//Estado
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		
		if(estado.isEmpty()) {
			System.out.println("--Por favor colocar o numero da casa--");
			
		}else {System.exit(0);
			int tamanho = estado.length();
			if(tamanho > 2) {
				System.out.println("por favor digitar o numero da casa");
				System.exit(0);
			}else {
				this.estado = estado;
			}
		}
		
	}
	
	

}

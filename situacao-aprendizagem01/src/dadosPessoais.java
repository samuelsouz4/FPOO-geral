
public class dadosPessoais {
	
	
private String nome;
private String Sobrenome;
private String dataNascimento;
private String genero;



//Nome
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	
	if(nome.isEmpty()) {
		System.out.println("--Nome é Obrigatorio--");
		System.exit(0);
	}else {
		int tamanho = nome.length();
		if(tamanho < 3) {
			System.out.println("--Minimo três caracteres--");
			System.exit(0);
		}else {
			this.nome = nome;
		}
	}
	
	this.nome = nome;
}


//SobreNome
public String getSobrenome() {
	return Sobrenome;
}

public void setSobrenome(String sobrenome) {
	
	if(sobrenome.isEmpty()) {
		System.out.println("--Sobrenome Obrigatorio--");
		System.exit(0);
	}else {
		int tamanho = sobrenome.length();
		if(tamanho <=3) {
			System.out.println("--Coloque o um minimo de três caracteres--");
			System.exit(0);
		}else {
			Sobrenome = sobrenome;
		}
	}
	
}


//DataDeNascimento
public String getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(String datanascimento) {
	
	if(datanascimento.isEmpty()) {
		System.out.println("--Por favor colocar data de nascimento--");
		System.exit(0);
	}else {
		int tamanho = datanascimento.length();
		if(tamanho < 10) {
			System.out.println("--Por favor colocar pelo menos 10 numeros--");
			System.exit(0);
		}else {
			this.dataNascimento = datanascimento;
		}
	}
	
}


//Genero
public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	
	if(genero.isEmpty()) {
		System.out.println("--Por Favor informe o Genero");
		System.exit(0);
	}else {
		if(genero.equalsIgnoreCase("feminino")) {
			this.genero = genero;
		}else {
			if(genero.equalsIgnoreCase("masculino")) {
				this.genero = genero;
			}else {
				if(genero.equalsIgnoreCase("outros")) {
					System.exit(0);
					this.genero = genero;
					
				}else {
						System.out.println("Apenas masculino, feminino e outro:");
						System.exit(0);
				}
			}
		}
	}
}


}

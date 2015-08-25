package modelo;


//padrão javabean
//Convenção criada pela Sun Microsystens
//que define uma classe que 
//encapsula os atributos usando o modificador
//de visibilidade private; e disponibiliza 
//a alteração e consulta dos valores dos mesmos
//somente através dos métodos get e set;
//define também que deve haver um construtor público
//default

public class Cliente {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

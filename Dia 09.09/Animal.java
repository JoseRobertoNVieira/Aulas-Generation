package Dia0909exerc;

public class Animal {

	private String nome;
    private String emiteSom;
	private int idade;
	
	public Animal (String nome, String emiteSom, int idade)
	{
		super();
		this.nome = nome;
	    this.emiteSom = emiteSom;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

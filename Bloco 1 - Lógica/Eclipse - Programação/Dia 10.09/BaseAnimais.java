package Dia1009;

public abstract class BaseAnimais {
	
	protected String nome;
	protected int idade;

	public BaseAnimais (String nome, int idade)
	{
		this.nome=nome;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

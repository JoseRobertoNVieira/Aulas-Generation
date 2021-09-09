package ProjetoJava2;

public class Cadastro {
	
	private String nome;
	private int idade;
	private String CPF;
	
	public Cadastro(String nome, int idade, String CPF)
	{
		super();
		this.nome = nome;
		this.idade = idade;	
		this.CPF = CPF;
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
}

package Dia0809;

public class Cliente {
	
	private String nome;
	private String local;
	private int idade;
	
	public Cliente(String nome,int idade,String local)
	{
		this.nome = nome;
		this.local = local;
		this.idade = idade;
	}

	public void Imprimir()
	{
		System.out.println("\nO(A) cliente "+nome+" tem "+idade+" anos e mora em "+local+".");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

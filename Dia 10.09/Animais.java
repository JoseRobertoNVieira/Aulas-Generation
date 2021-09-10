package Dia1009;

public abstract class Animais {
	
	private String nome;
	private int idade;
	private String emiteSom;
	private String seMove;
	
	public Animais(String nome, int idade, String emiteSom, String seMove)
	{
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		this.seMove = seMove;
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
	public String getEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}
	public String getSeMove() {
		return seMove;
	}
	public void setSeMove(String seMove) {
		this.seMove = seMove;
	}
	
	
}

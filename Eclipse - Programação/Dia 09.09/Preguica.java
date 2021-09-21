package Dia0909exerc;

public class Preguica extends Animal {
	
	private String pSobe;
	
	public Preguica (String nome, String emiteSom, String pSobe, int idade)
	{
		super(nome,emiteSom,idade);
		this.pSobe = pSobe;
	}

	
	
	public String getpSobe() {
		return pSobe;
	}



	public void setpSobe(String pSobe) {
		this.pSobe = pSobe;
	}



	public void Imprimir()
	{
		System.out.println("\nA preguiça chamada "+getNome()+" tem "+getIdade()+" anos.\nEla "+getEmiteSom()+" e "+pSobe+".");
	}
}
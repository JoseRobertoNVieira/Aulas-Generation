package Dia0909exerc;

public class Cachorro extends Animal {
	
	private String cCorre;
	
	public Cachorro (String nome, String emiteSom, String cCorre, int idade)
	{
		super(nome,emiteSom,idade);
		this.cCorre = cCorre;
	}

	public String getcCorre() {
		return cCorre;
	}

	public void setcCorre(String cCorre) {
		this.cCorre = cCorre;
	}
	
	public void Imprimir()
	{
		System.out.println("\nO cachorro chamado "+getNome()+" tem "+getIdade()+" anos.\nEle "+getEmiteSom()+" e "+cCorre+".");
	}
}
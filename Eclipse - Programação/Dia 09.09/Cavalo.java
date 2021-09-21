package Dia0909exerc;

public class Cavalo extends Animal {
	
	private String caCorre;
	
	public Cavalo (String nome, String emiteSom, String caCorre, int idade)
	{
		super(nome,emiteSom,idade);
		this.caCorre = caCorre;
	}

	public String getcaCorre() {
		return caCorre;
	}

	public void setcaCorre(String cCorre) {
		this.caCorre = cCorre;
	}
	
	public void Imprimir()
	{
		System.out.println("\nO cavalo chamado "+getNome()+" tem "+getIdade()+" anos.\nEle "+getEmiteSom()+" e "+caCorre+".");
	}
}
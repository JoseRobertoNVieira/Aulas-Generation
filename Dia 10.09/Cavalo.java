package Dia1009;

public class Cavalo extends BaseAnimais implements Animais{
	
	public Cavalo (String nome, int idade)
	{
		super(nome,idade);
	}

    @Override
    public void emiteSom()
    {
    	System.out.println("\nO cavalo relincha.");
    }
	
    @Override
    public void seMove()
    {
    	System.out.println("\nO cavalo corre.");
    }
	
	
}
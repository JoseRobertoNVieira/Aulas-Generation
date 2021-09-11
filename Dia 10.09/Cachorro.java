package Dia1009;

public class Cachorro extends BaseAnimais implements Animais{
	
	public Cachorro(String nome, int idade)
	{
		super(nome,idade);
	}

    @Override
    public void emiteSom()
    {
    	System.out.println("\nO cachorro late.");
    }
	
    @Override
    public void seMove()
    {
    	System.out.println("\nO cachorro corre.");
    }
	
	
}
package Dia1009;

public class Preguica extends BaseAnimais implements Animais{
	
	public Preguica(String nome, int idade)
	{
		super(nome,idade);
	}

    @Override
    public void emiteSom()
    {
    	System.out.println("\nA preguiça chia.");
    }
	
    @Override
    public void seMove()
    {
    	System.out.println("\nO preguiça sobe em árvores.");
    }
	
	
}
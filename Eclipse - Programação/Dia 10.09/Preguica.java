package Dia1009;

public class Preguica extends BaseAnimais implements Animais{
	
	public Preguica(String nome, int idade)
	{
		super(nome,idade);
	}

    @Override
    public void emiteSom()
    {
    	System.out.println("\nA pregui�a chia.");
    }
	
    @Override
    public void seMove()
    {
    	System.out.println("\nO pregui�a sobe em �rvores.");
    }
	
	
}
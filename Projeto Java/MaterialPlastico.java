package projetoreciclagem;

public class MaterialPlastico extends MaterialReciclavel implements Reciclagem {
	
	private int garrafaPet;
	private int embalagemPlastica;
	private double outrosPlasticos;
	
	public MaterialPlastico(int tipo)
	{
	       super(tipo);
	}

	public int getGarrafaPet() {
		return garrafaPet;
	}

	public void setGarrafaPet(int garrafaPet) {
		this.garrafaPet = garrafaPet;
	}

	public int getEmbalagemPlastica() {
		return embalagemPlastica;
	}

	public void setEmbalagemPlastica(int embalagemPlastica) {
		this.embalagemPlastica = embalagemPlastica;
	}

	public double getOutrosPlasticos() {
		return outrosPlasticos;
	}

	public void setOutrosPlasticos(double outrosPlasticos) {
		this.outrosPlasticos = outrosPlasticos;
	}
	
	@Override
	public void descartar()
	{
	System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja descartar --");
	System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem pl�stica \n\t3 - Outro tipo de pl�stico\n\t4 - Sair");
	setTipo(leia.nextInt());
	
	while(getTipo() < 1 || getTipo() > 4)
	{
		System.out.println("\nOp��o Inv�lida");
		System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja descartar --");
		System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem pl�stica \n\t3 - Outro tipo de pl�stico\n\t4 - Sair");
		setTipo(leia.nextInt());
	}
	
	switch(getTipo())
	{
	case 1:
		System.out.println("\nRetire todo o conte�do da garrafa, e tamb�m o r�tulo (se possivel, lave).\nCom a garrafa aberta, amasse-a, e depois, coloque a tampa.\nDescarte-a no cesto destinado ao pl�stico ou separado do lixo org�nico.");
		break;
	case 2:
		System.out.println("\nRetire quaisquer partes n�o pl�sticas do conte�do (se possivel, lave).\nDescarte-a no cesto destinado ao pl�stico ou separado do lixo org�nico.");
		break;
	case 3:
		System.out.println("\nRetire quaisquer partes n�o pl�sticas do conte�do (se possivel, lave).\nDescarte-a no cesto destinado ao pl�stico ou separado do lixo org�nico.");
	    break;	
	    default:
			System.out.println("Obrigado por utilizar nosso sistema. Saindo ...");
	}
	}
	
	@Override
	public void danoAmbiente() 
	{
		System.out.println("\nO pl�stico leva em m�dia 400 anos para se decompor e ainda libera gases t�xicos que podem afetar o solo, a �gua e o ar, prejudicando alimentos, animais causando doen�as nas pessoas.");
	}
	
	@Override
	public void reutilizar() 
	{
		System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja reutilizar --");
		System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem pl�stica \n\t3 - Outro tipo de pl�stico\n\t4 - Sair");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() > 4)
		{
			System.out.println("\nOp��o Inv�lida");
			System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja reutilizar --");
			System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem pl�stica \n\t3 - Outro tipo de pl�stico\n\t4 - Sair");
			setTipo(leia.nextInt());
		}
		
		switch(getTipo())
		{
		case 1:
			System.out.println("\nVoc� pode cortar a garrafa ao meio, e fazer um vaso para plantas.\n� poss�vel fazer um estojo ao cortar a parte lateral da garrafa."
					+ "\nAo cortar o fundo da garrafa, podemos transforma-la em um pote de �gua para animais.");
			break;
		case 2:
			System.out.println("\nO pl�stico reciclado pode virar qualquer coisa, desde novos itens de pl�stico, como garrafas, novas embalagens, at� asfalto.");
			break;
		case 3:
			System.out.println("\nO pl�stico reciclado pode virar qualquer coisa, desde novos itens de pl�stico, como garrafas, novas embalagens, at� asfalto.");
			break;
			default:
				System.out.println("Obrigado por utilizar nosso sistema. Saindo ...");
		}
		}
	
	
}

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
	System.out.println("\n\t-- Escolha o tipo de plástico que deseja descartar --");
	System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem plástica \n\t3 - Outro tipo de plástico\n\t4 - Sair");
	setTipo(leia.nextInt());
	
	while(getTipo() < 1 || getTipo() > 4)
	{
		System.out.println("\nOpção Inválida");
		System.out.println("\n\t-- Escolha o tipo de plástico que deseja descartar --");
		System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem plástica \n\t3 - Outro tipo de plástico\n\t4 - Sair");
		setTipo(leia.nextInt());
	}
	
	switch(getTipo())
	{
	case 1:
		System.out.println("\nRetire todo o conteúdo da garrafa, e também o rótulo (se possivel, lave).\nCom a garrafa aberta, amasse-a, e depois, coloque a tampa.\nDescarte-a no cesto destinado ao plástico ou separado do lixo orgânico.");
		break;
	case 2:
		System.out.println("\nRetire quaisquer partes não plásticas do conteúdo (se possivel, lave).\nDescarte-a no cesto destinado ao plástico ou separado do lixo orgânico.");
		break;
	case 3:
		System.out.println("\nRetire quaisquer partes não plásticas do conteúdo (se possivel, lave).\nDescarte-a no cesto destinado ao plástico ou separado do lixo orgânico.");
	    break;	
	    default:
			System.out.println("Obrigado por utilizar nosso sistema. Saindo ...");
	}
	}
	
	@Override
	public void danoAmbiente() 
	{
		System.out.println("\nO plástico leva em média 400 anos para se decompor e ainda libera gases tóxicos que podem afetar o solo, a água e o ar, prejudicando alimentos, animais causando doenças nas pessoas.");
	}
	
	@Override
	public void reutilizar() 
	{
		System.out.println("\n\t-- Escolha o tipo de plástico que deseja reutilizar --");
		System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem plástica \n\t3 - Outro tipo de plástico\n\t4 - Sair");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() > 4)
		{
			System.out.println("\nOpção Inválida");
			System.out.println("\n\t-- Escolha o tipo de plástico que deseja reutilizar --");
			System.out.println("\n\t1 - Garrafa pet\n\t2 - Embalagem plástica \n\t3 - Outro tipo de plástico\n\t4 - Sair");
			setTipo(leia.nextInt());
		}
		
		switch(getTipo())
		{
		case 1:
			System.out.println("\nVocê pode cortar a garrafa ao meio, e fazer um vaso para plantas.\nÉ possível fazer um estojo ao cortar a parte lateral da garrafa."
					+ "\nAo cortar o fundo da garrafa, podemos transforma-la em um pote de água para animais.");
			break;
		case 2:
			System.out.println("\nO plástico reciclado pode virar qualquer coisa, desde novos itens de plástico, como garrafas, novas embalagens, até asfalto.");
			break;
		case 3:
			System.out.println("\nO plástico reciclado pode virar qualquer coisa, desde novos itens de plástico, como garrafas, novas embalagens, até asfalto.");
			break;
			default:
				System.out.println("Obrigado por utilizar nosso sistema. Saindo ...");
		}
		}
	
	
}

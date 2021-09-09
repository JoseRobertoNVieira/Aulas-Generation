package ProjetoJava2;

public class AvaliacaoClinica extends Cadastro{
	
	private double peso;
	private double altura;
	private String sexo;
	private double temperatura;
    private double pressaoArterialSis;
    private double pressaoArterialDis;
    private double colesterol;
    private double diabetes;
    
    public AvaliacaoClinica(String nome, int idade, double peso, String CPF, 
    		double altura, String sexo, double temperatura, double pressaoArterialSis, double pressaoArterialDis)
    
    {
    	super(nome, idade, CPF);
    	this.peso = peso;
    	this.altura = altura;
    	this.sexo = sexo;
    	this.temperatura = temperatura;
    	this.pressaoArterialSis = pressaoArterialSis;
    	this.pressaoArterialDis = pressaoArterialDis;

    }

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPressaoArterialSis() {
		return pressaoArterialSis;
	}

	public void setPressaoArterialSis(double pressaoArterialSis) {
		this.pressaoArterialSis = pressaoArterialSis;
	}
	
	public double getPressaoArterialDis() {
		return pressaoArterialDis;
	}

	public void setPressaoArterialDis(double pressaoArterialDis) {
		this.pressaoArterialDis = pressaoArterialDis;
	}

	public double getColesterol() {
		return colesterol;
	}

	public void setColesterol(double colesterol) {
		this.colesterol = colesterol;
	}

	public double getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(double diabetes) {
		this.diabetes = diabetes;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
     
	public void avaliacaoPeso()
	{
		double imc;
		imc = getPeso() / (getAltura()*getAltura());
		
		if(imc>=40)
		{
			System.out.println("\nO seu IMC representa Obesidade Mórbida.");
		}
		else if(imc>=35 && imc<39.9)
		{
			System.out.println("\nO seu IMC representa Obesidade Grau II.");
		}
		else if(imc>=30 && imc<34.9)
		{
			System.out.println("\nO seu IMC representa Obesidade Grau I.");
		}
		else if(imc>=25 && imc<29.9)
		{
			System.out.println("\nO seu IMC representa Sobrepeso.");
		}
		else if(imc>=18.5 && imc<24.9)
		{
			System.out.println("\nO seu IMC representa Peso Normal.");
		}
		else
		{
			System.out.println("\nO seu IMC representa Abaixo do Peso.");
		}
	}
	public void avaliacaoFebre()
	{
		if(temperatura>=41)
		{
			System.out.println("\nSua temperatura reflete Hipertermia.");
		}
		else if(temperatura>39.6 && temperatura<41)
		{
			System.out.println("\nSua temperatura reflete Febre alta.");
		}
		else if(temperatura>37.6 && temperatura<39.5)
		{
			System.out.println("\nSua temperatura reflete Febre.");
		}
		else if(temperatura>36 && temperatura<37.5)
		{
			System.out.println("\nSua temperatura reflete Normal.");
		}
		else
		{
			System.out.println("\nSua temperatura reflete Hipotermia.");
		}
	}
	public void avaliacaoPressao()
	{
		if(pressaoArterialSis<120 && pressaoArterialDis<80)
		{
			System.out.println("\nPressão Normal.");
		}
		else if(pressaoArterialSis>139 || pressaoArterialDis>89)
		{
			System.out.println("\nPré Hipertensão.");
		}
		else if(pressaoArterialSis>159 || pressaoArterialDis>99)
		{
			System.out.println("\nPressão Elevada N1.");
		}
		else if(pressaoArterialSis>120 || pressaoArterialDis>80)
		{
			System.out.println("\nPressão Elevada N2");
		}
		else
		{
			System.out.println("\nCrise Hipertensiva.");
		}
	}
}

package ProjetoJava2;

public class TesteCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AvaliacaoClinica teste = new AvaliacaoClinica("Joao",23,95,"3243242",1.76,"F",42.4,139,84);

		teste.avaliacaoPeso();
		teste.avaliacaoFebre();
		teste.avaliacaoPressao();
		
	}
}

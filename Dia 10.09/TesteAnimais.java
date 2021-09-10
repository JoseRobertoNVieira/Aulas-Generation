package Dia1009;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro();
		System.out.println("\nO cachorro chamado "+cachorro.getNome()+" tem "+cachorro.getIdade()+" anos.");
        System.out.println("\nO cachorro "+cachorro.getEmiteSom()+" e "+cachorro.getSeMove());
		
		Cavalo cavalo = new Cavalo();
		System.out.println("\nO cavalo chamado "+cavalo.getNome()+" tem "+cavalo.getIdade()+" anos.");
		System.out.println("\nO cavalo "+cavalo.getEmiteSom()+" e "+cavalo.getSeMove());
		
		Preguica preguica = new Preguica();
		System.out.println("\nA preguiça chamada "+preguica.getNome()+" tem "+preguica.getIdade()+" anos.");
		System.out.println("\nA preguiça "+preguica.getEmiteSom()+" e "+preguica.getSeMove());
	}
}

package Dia1009;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro("Rex",2);
		Cavalo cavalo = new Cavalo("Trovão",4);
		Preguica preguica = new Preguica("Veloz",7);
		
		System.out.println("\nO cachorro chamado "+cachorro.getNome()+" tem "+cachorro.getIdade()+" anos.");
	    cachorro.seMove();
	    cachorro.emiteSom();
	    
	    System.out.println("\nO cavalo chamado "+cavalo.getNome()+" tem "+cavalo.getIdade()+" anos.");
	    cavalo.seMove();
	    cavalo.emiteSom();
	    
	    System.out.println("\nA preguiça chamada "+preguica.getNome()+" tem "+preguica.getIdade()+" anos.");
	    preguica.seMove();
	    preguica.emiteSom();
	}

}

package projetoreciclagem;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaterialPapel papel = new MaterialPapel();
		//papel.descartar();
		//papel.calcularReciclaveis();
		//papel.danoAmbiente(); // ser� chamado no m�todo calcular
		//papel.reutilizar();
		
		MaterialVidro vidro = new MaterialVidro();
		//vidro.descartar();
		//vidro.calcularReciclaveis();
		//vidro.danoAmbiente(); //ser� chamado no m�todo calcular
		//vidro.reutilizar();
		
		MaterialPlastico plastico = new MaterialPlastico();
		//plastico.descartar();
		//plastico.calcularReciclaveis();
		//plastico.danoAmbiente(); //ser� chamado no m�todo calcular
		//plastico.reutilizar();
		
		MaterialEspecial especial = new MaterialEspecial();
		//especial.descartar();
		//especial.calcularReciclaveis();
		//especial.danoAmbiente(); //ser� chamado no m�todo calcular
		//especial.reutilizar();
		
		MaterialMetal metal = new MaterialMetal();
		//metal.descartar();
		//metal.calcularReciclaveis();
		//metal.danoAmbiente(); //ser� chamado no m�todo calcular
		//metal.reutilizar();
	}

}
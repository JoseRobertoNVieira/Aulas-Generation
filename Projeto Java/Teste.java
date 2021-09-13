package projetoreciclagem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		MaterialPapel papel = new MaterialPapel();
		MaterialPlastico plastico = new MaterialPlastico();
		MaterialMetal metal = new MaterialMetal();
		MaterialVidro vidro = new MaterialVidro();
		MaterialEspecial especial = new MaterialEspecial();
		
		int op;
		int op2;
		boolean loop = true;
		
		do
		{
		try
		{
		System.out.println("\nBem-vindo ao Sistema de Reciclagem!");
		System.out.println("\nEscolha a categoria do item que deseja reciclar: ");
		System.out.println("\n1-Papel\n2-Plástico\n3-Metal\n4-Vidro\n5-Especiais\n6-Sair\n\n\n");
        op = leia.nextInt();

        while(op < 1 || op > 6)
        {
        System.out.println("\nOpção Inválida, tente novamente.");
		System.out.println("\nEscolha a categoria do item que deseja reciclar: ");
		System.out.println("\n1-Papel\n2-Plástico\n3-Metal\n4-Vidro\n5-Especiais\n6-Sair\n\n\n");
        op = leia.nextInt();
        }
        switch(op)
        {
        case 1: // PAPEL
        	System.out.println();
        	System.out.println("\n---O material escolhido foi Papel---");
            System.out.println("\nSelecione o que deseja fazer com o papel: ");
            System.out.println("\n1-Descartar\n2-Calcular o impacto no ambiente\n3-Reutilizar\n4-Sair\n\n\n ");
            op2 = leia.nextInt();
           
            if(op2 == 1)
            {
            	papel.descartar();
            }
            if(op2 == 2)
            {
            	papel.calcularReciclaveis();
            }
            if(op2 == 3)
            {
            	papel.reutilizar();
            }
            break;
        case 2: // PLASTICO
        	System.out.println();
        	System.out.println("\n---O material escolhido foi Plástico---");
            System.out.println("\nSelecione o que deseja fazer com o plástico: ");
            System.out.println("\n1-Descartar\n2-Calcular o impacto no ambiente\n3-Reutilizar\n4-Sair\n\n\n ");
            op2 = leia.nextInt();
            
            if(op2 == 1)
            {
            	plastico.descartar();
            }
            if(op2 == 2)
            {
            	plastico.calcularReciclaveis();
            }
            if(op2 == 3)
            {
            	plastico.reutilizar();
            }
            break;
        case 3: // METAL
        	System.out.println();
        	System.out.println("\n---O material escolhido foi Metal---");
            System.out.println("\nSelecione o que deseja fazer com o metal: ");
            System.out.println("\n1-Descartar\n2-Calcular o impacto no ambiente\n3-Reutilizar\n4-Sair\n\n\n ");
            op2 = leia.nextInt();
            
            if(op2 == 1)
            {
            	metal.descartar();
            }
            if(op2 == 2)
            {
            	metal.calcularReciclaveis();
            }
            if(op2 == 3)
            {
            	metal.reutilizar();
            }
            break;
        case 4: // VIDRO
        	System.out.println();
        	System.out.println("\n---O material escolhido foi Vidro---");
            System.out.println("\nSelecione o que deseja fazer com o vidro: ");
            System.out.println("\n1-Descartar\n2-Calcular o impacto no ambiente\n3-Reutilizar\n4-Sair\n\n\n ");
            op2 = leia.nextInt();
            
            if(op2 == 1)
            {
            	vidro.descartar();
            }
            if(op2 == 2)
            {
            	vidro.calcularReciclaveis();
            }
            if(op2 == 3)
            {
            	vidro.reutilizar();
            }
            break;
        case 5: // ESPECIAL
        	System.out.println();
        	System.out.println("\n---O material escolhido foi Especial---");
            System.out.println("\nSelecione o que deseja fazer com o material especial: ");
            System.out.println("\n1-Descartar\n2-Calcular o impacto no ambiente\n3-Reutilizar\n4-Sair\n\n\n ");
            op2 = leia.nextInt();
            
            if(op2 == 1)
            {
            	especial.descartar();
            }
            if(op2 == 2)
            {
            	especial.calcularReciclaveis();
            }
            if(op2 == 3)
            {
            	especial.reutilizar();
            }
            break;
        case 6: // SAIR
        	System.out.println("\nObrigado por utilizar nosso sistema. Saindo ...");
        	break;
            default:
            {
            	System.out.println("\nOpção inválida, saindo do sistema");
            }
        }
        loop = false;
        }
		catch(InputMismatchException inputMismatchException)
		{
			System.err.printf("\nErro: %s\n",inputMismatchException);
    	    leia.nextLine();
    	    System.out.println("\nVocê deve entrar com um valor do tipo inteiro. "
    	    		+ "Por favor, tente novamente\n");
		}
   }
   while(loop);
}
}

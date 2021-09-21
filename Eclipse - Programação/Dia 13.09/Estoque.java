package Dia1309;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia = new Scanner(System.in);
	    ArrayList <String> estoque = new ArrayList();
	
	    do
	    {
	    	System.out.println("\n---ESTOQUE---");
	    	System.out.println("\n1-Adicionar produto ao estoque");
	    	System.out.println("\n2-Remover produto do estoque");
	    	System.out.println("\n3-Alterar produto do estoque");
	    	System.out.println("\n4-Mostrar estoque");
	    	System.out.println("\n5-Limpar estoque");
	    	System.out.println("\n0-Sair");
	        System.out.println("\nQual a sua opção?");
	        op = leia.nextInt();
	        
	        switch(op)
	        {
	        case 1:
	        	leia.nextLine();
	        	System.out.println("\nDigite o nome do produto para adicionar ao estoque: ");
	        	String produto = leia.nextLine();
	        	estoque.add(produto);
	        	break;
	        case 2:
	        	leia.nextLine();
	        	System.out.println("\nDigite o nome do produto para remover do estoque: ");
	        	String rproduto = leia.nextLine();
	        	if(estoque.contains(rproduto))
	        	{
	        		estoque.remove(rproduto);
	        	}
	        	else
	        	{
	        		System.out.println("\nProduto não encontrado.");
	        	}
	        	break;
	        case 3:
	        	leia.nextLine();
	        	System.out.println("\nInsira o nome do produto que será substituido:  ");
	            String alterar = leia.nextLine();
	            System.out.println("\nDigite o nome do produto que entrará no lugar do produto "+alterar);
	            String novo = leia.nextLine();
	            
	            if(estoque.contains(alterar))
	        	{
	        		estoque.remove(alterar);
	        		estoque.add(novo);
	        	}
	        	else
	        	{
	        		System.out.println("\nProduto não encontrado.");
	        	}
	            break;
	        case 4:
	        	System.out.println("\nOs produtos do estoque são: ");
	        	System.out.println(estoque);
	        	break;
	        case 5:
	        	System.out.println("\n\t---LIMPANDO ESTOQUE---");
	        	estoque.clear();
	            System.out.println(estoque);
	        	default:
	        		System.out.println("\n--- Opção Inválida ---");
	        }
	    }while(op!=0);
	}

}

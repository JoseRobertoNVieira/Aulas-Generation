package Dia0309;

import java.util.Scanner;

public class ex4dia0309 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];
		float constante;
		int l,c,op;
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("\nEntre com o valor da Matriz 1:");
				matriz1[l][c] = leia.nextFloat();
				System.out.println("\nEntre com o valor da Matriz 2:");
				matriz2[l][c] = leia.nextFloat();	
			}
		}
		
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1-Soma das Matrizes");
		System.out.println("\n2-Subtração das Matrizes");
		System.out.println("\n3-Adicionar constante");
		System.out.println("\n4-Mostrar matrizes");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1:
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
				     matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
				     System.out.println("\nSoma: "+matriz3[l][c]);
				}
			}
			break;
		case 2:
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
				     matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
				     System.out.println("\nDiferença: "+matriz3[l][c]);
				}
			}
			break;
		case 3:
			System.out.println("\nInsira uma constante: ");
			constante = leia.nextFloat();
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
				     matriz1[l][c] = matriz1[l][c] + constante;
				     matriz2[l][c] = matriz2[l][c] + constante;
				     
				     System.out.println("\nMatriz 1: "+matriz1[l][c]);
				     System.out.println("\nMatriz 2: "+matriz2[l][c]);
				}
			}
			break;
		case 4:
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
				     System.out.println("\nMatriz 1: "+matriz1[l][c]);
				     System.out.println("\nMatriz 2: "+matriz2[l][c]);
				}
			}
			break;
			default:
				System.out.println("\nOpção Invalida");

		}
	}
}

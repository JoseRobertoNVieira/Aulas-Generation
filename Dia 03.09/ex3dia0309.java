package Dia0309;

import java.util.Scanner;

public class ex3dia0309 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int linha=3,coluna=3;
		int numeros[][] = new int[linha][coluna];
		int x,contador=0,num;
		
		for(int l=0;l<linha;l++)
        {
        	for(int c=0;c<coluna;c++)
        	{
        		System.out.println("\nInsira um número: ");
        		num = leia.nextInt();
        		
				if(num>10)
				{
					contador++;
				}
			}
		}
		System.out.println("\nO sistema possui "+contador+" números maiores que 10.");

	}

}

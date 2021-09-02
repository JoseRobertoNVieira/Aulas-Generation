package Dia0209;

import java.util.Scanner;

public class ex3dia0209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,maiorIdade=0,menorIdade=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira usa idade: ");
		idade = leia.nextInt();
		
		while(idade>-99)
		{
			if(idade<=21)
			{
			menorIdade++;
			System.out.println("\nInsira usa idade: ");
			idade = leia.nextInt();
			}
			else if(idade>=50)
			{
				maiorIdade++;
				System.out.println("\nInsira usa idade: ");
				idade = leia.nextInt();
			}
		}
		System.out.printf("\nExistem %d pessoas com menos de 21 anos.",menorIdade);
		System.out.printf("\nExistem %d pessoas com mais de 50 anos.",maiorIdade);	
	}

}

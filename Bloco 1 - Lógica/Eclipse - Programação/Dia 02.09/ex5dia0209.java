package Dia0209;

import java.util.Scanner;

public class ex5dia0209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		int num,somaNum=0,x=1;
		
		do
		{
			System.out.println("\nInsira um n�mero: ");
			num =leia.nextInt();
			
			somaNum += num;
		}
		while(num!=0);
		System.out.println("\nA soma dos n�meros �: "+somaNum);
	}
}

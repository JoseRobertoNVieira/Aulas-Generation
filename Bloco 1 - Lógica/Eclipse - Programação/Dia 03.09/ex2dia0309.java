package Dia0309;

import java.util.Scanner;

public class ex2dia0309 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num[] = new int[6];
		int x,somaPar=0,contImpar=0,numPar=0,numImpar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInsira um n�mero: ");
			num[x] = leia.nextInt();
			
		if(num[x] % 2 == 0)
		{
			somaPar += num[x];
		}
		else
		{
			contImpar++;
		}
		numPar = num[x]++;
	}
	System.out.printf("\nOs n�meros pares digitados foram: %d",numPar);
	System.out.printf("\nA soma de n�meros pares �: %d",somaPar);
	System.out.printf("\nOs n�meros impares digitados foram: ",numImpar);
	System.out.printf("\nA quantidade de n�meros impares �: %d",contImpar);
	}

}

package Dia0209;

import java.util.Scanner;

public class ex2dia0209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,contPar=0,contImpar=0,x;
				
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
		System.out.println("\nInsira um n�mero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0)
		{
			contPar++;
		}
		else
		{
			contImpar++;
		}
		}
		System.out.printf("\nA quantidade de n�meros pares � %d.",contPar);
		System.out.printf("\nA quantidade de n�meros impares � %d.",contImpar);
	}

}

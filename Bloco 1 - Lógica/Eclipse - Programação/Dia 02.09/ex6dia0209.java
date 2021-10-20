package Dia0209;

import java.util.Scanner;

public class ex6dia0209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int num,x,contNum=0,somaNum=0,media;
		
		do
		{
			System.out.println("\nInsira um número: ");
			num = leia.nextInt();
			
			if(num % 3 == 0)
			{
				contNum++;
				somaNum += num;
			}
			media = somaNum / contNum;
		}
		while(num!=0);
		System.out.println("\nA média dos números multiplos de três é:"+media);
	}

}

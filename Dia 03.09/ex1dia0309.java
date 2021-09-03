package Dia0309;

import java.util.Scanner;

public class ex1dia0309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int A[] = { 1, 0, 5, 100, -5, 7}; // a // c
		int somaPos;
		
		somaPos = A[0] + A[1] + A[5]; // b
		System.out.printf("\nA soma das posições A[0], A[1] e A[5] é: "+somaPos+"\n\n");
		
		for(int x=0;x<6;x++)
		{
			System.out.println(A[x]);
		}
	}
}

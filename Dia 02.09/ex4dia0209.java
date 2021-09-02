package Dia0209;

import java.util.Scanner;

public class ex4dia0209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner leia = new Scanner(System.in);
        
        int x=1,idade,genero,ep,contC=0,contMN=0,contHA=0,contOC=0,contVN=0,contJC=0;
        
        while(x<=5)
        {
        	System.out.println("\nInsira sua idade: ");
        	idade = leia.nextInt();
        	while(idade<1 || idade>130)
        	{
        		System.out.print("\nEntre com uma idade válida: ");
        		idade = leia.nextInt();
        	}
        	System.out.println("\nInsira seu gênero:\n1-Feminino.\n2-Masculino.\n3-Outros. ");
        	genero = leia.nextInt();
        	while(genero<1 || genero>3)
        	{
        		System.out.println("\nInsira um gênero válido:\n1-Feminino.\n2-Masculino.\n3-Outros. ");
            	genero = leia.nextInt();
        	}
        	System.out.println("\nInsira seu estado psicologico:\n1-Calmo.\n2-Nervoso.\n3-Agressivo. ");
        	ep = leia.nextInt();
        	while(ep<1 || ep>3)
        	{
        		System.out.println("\nInsira um estado psicologico válido:\n1-Calmo.\n2-Nervoso.\n3-Agressivo. ");
            	ep = leia.nextInt();
        	}
        	
        	if(ep == 1)
        	{
        		contC++;
        	}
        	if(genero == 1 && ep == 2)
        	{
        		contMN++;
        	}
        	if(genero == 2 && ep == 3)
        	{
        		contHA++;
        	}
        	if(genero == 3 && ep == 1)
        	{
        		contOC++;
        	}
        	if(ep == 2 && idade>40)
        	{
        		contVN++;
        	}
        	if(ep == 1 && idade<18)
        	{
        		contJC++;
        	}
        	x++;
        }
        System.out.println("\nPessoas calmas: "+contC);
        System.out.println("\nMulheres nervosas: "+contMN);
        System.out.println("\nHomens gressivos: "+contHA);
        System.out.println("\nOutros calmos: "+contOC);
        System.out.println("\nVelhos nervosos: "+contVN);
        System.out.println("\nJovens calmos: "+contJC);
	    }	   
	}


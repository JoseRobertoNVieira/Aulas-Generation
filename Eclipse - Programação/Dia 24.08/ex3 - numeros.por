programa
{
	
	funcao inicio()
	{
		inteiro num1,num2,num3,num4,q1,q2,q3,q4

		escreva("\nInsira o número 1: ")
		leia(num1)
		escreva("\nInsira o número 2: ")
		leia(num2)
		escreva("\nInsira o número 3: ")
		leia(num3)
		escreva("\nInsira o número 4: ")
		leia(num4)

		q1=(num1*num1)
		q2=(num2*num2)
		q3=(num3*num3)
		q4=(num4*num4)

		limpa()

		se(q3>=1000)
		{
          escreva("\nO quadrado do terceiro número é: ",q3)
		}

		senao se(q3<1000)
		{
	     escreva("\nO resultado é: \n",num1," ao quadrado é ",q1,"\n" ,num2," ao quadrado é ",q2,"\n" ,num3," ao quadrado é ",q3,"\n", num4," ao quadrado é ",q4)
	    
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
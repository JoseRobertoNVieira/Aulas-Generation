programa
{
	
	funcao inicio()
	{
		inteiro x,numero,res=0

          para(x=1;x<=500;x++)
          {
		escreva("\nInsira um número de 1 até 500: ")
		leia(numero)

		se(numero % 3 == 0)
		{
			res = res + numero
			escreva("\nA soma dos números multiplos de 3 é: ",res,"\n")
		}
		senao
		escreva("\nO número inserido não é multiplo de 3. \n")
		
          }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
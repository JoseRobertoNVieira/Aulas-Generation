programa
{
	
	funcao inicio()
	{
	inteiro h,b,area
	
		escreva("\nInsira o valor da altura: ")
		leia(h)

		escreva("\nInsira o valor do lado B: ")
		leia(b)

     se(h>0 e b>0)
     {
     	area = (h * b) / 2

          limpa()
     	escreva("\nA área do triângulo é: ",area)
     }
     
     senao se(h<=0 ou b<=0)
     {
     	limpa()
     	escreva("\nA base e altura devem ser maiores que 0.")
     }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
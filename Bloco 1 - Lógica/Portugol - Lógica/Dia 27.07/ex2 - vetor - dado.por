programa
{
	
	funcao inicio()
	{
		inteiro dado[10],somaL=0,mediaL,maiorPont=0,x

		para(x=0;x<10;x++)
		{
			escreva("\nLançamento ",x+1," : ")
			leia(dado[x])

			somaL += dado[x]

			se(dado[x] == 6)
			{ 
				maiorPont ++
			}
			
		}
		mediaL = somaL / 10

		escreva("\nA média de lançamentos foi: ",mediaL)
		escreva("\nO dado caiu na maior pontuação ",maiorPont," vezes.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
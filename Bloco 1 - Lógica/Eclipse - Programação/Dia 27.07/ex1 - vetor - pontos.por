programa
{
	
	funcao inicio()
	{
		real valores[5],pont,maiorPont=0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nInsira a pontuação: ")
			leia(pont)

          se(maiorPont<pont)
          {
          	maiorPont = pont
          }
		}
		escreva("\nA maior pontuação foi de: ",maiorPont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 6, 7, 7}-{pont, 6, 18, 4}-{x, 7, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
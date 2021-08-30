programa
{
	
	funcao inicio()
	{
		real np
		cadeia ind1,ind2,ind3

		escreva("\nInsira o nível de poluição atual: ")
		leia(np)

		se (np>0.05 e np<0.25)
          {
          	escreva("\nÍndice de poluição aceitável.")
          }
          se(np>=0.25 e np<0.39)
          {
          	escreva("\nA primeira indústria deve parar suas atividades.")
          }
          se(np>=0.39 e np<0.49)
          {
          	escreva("\nA segunda e terceira indústrias devem parar suas atividades.")
          }
          se(np>=0.5)
          {
          	escreva("\nTodas as indústrias devem parar suas atividades.")
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
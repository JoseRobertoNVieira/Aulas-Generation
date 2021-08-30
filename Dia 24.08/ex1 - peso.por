programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	
	{
	     inteiro p,E,m

		escreva("\nInsira o peso: ")
		leia(p)

		se(p<50)
          {
	     escreva("\nNão há excesso de peso.")
		}
	
          senao se(p>=50)
          {
          E=(p-50)
          m=(E*4)
          

          escreva("\nHá ",E," quilo(s) de excesso, sua multa é de ",m," reais.")
          
          
          }}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
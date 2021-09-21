programa
{
	
	funcao inicio()

     { inteiro id
	
		escreva("\nInsira sua idade: ")
		leia(id)

		se(id>=5 e id<=7)
          {
          escreva("\nO nadador está na categoria Infantil A.")
          }
          se(id>=8 e id<=11)
          {
          escreva("\nO nadador está na categoria Infantil B.")
          }
          se(id>=12 e id<=13)
          {
          escreva("\nO nadador está na categoria Juvenil A.")
          }
          se(id>=14 e id<=17)
          {
          escreva("\nO nadador está na categoria Juvenil B.")
          }
          se(id>17)
          {
          escreva("\nO nadador se encaixa na categoria Adultos.")
          }
          senao se(id<5)
          {
          escreva("\nO nadador não se encaixa em nenhuma categoria.")
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 772; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
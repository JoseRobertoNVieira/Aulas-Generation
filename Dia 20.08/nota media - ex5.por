programa
{
	
	funcao inicio()
	{

	real notaa,notab,notac,notaa1,notab1,notac1,media
	
		escreva("\nInsira a nota A: ")
		leia(notaa)
		escreva("\nInsira a nota B: ")
		leia(notab)
		escreva("\nInsira a nota C: ")
		leia(notac)

		notaa1 = notaa * 0.2
		notab1 = notab * 0.3
		notac1 = notac * 0.5

		media = notaa1 + notab1 + notac1

		escreva("\nA média das suas notas foi: ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
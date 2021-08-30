programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro dias1,ano,meses,dias,resto1

		escreva ("\nInsira o número de dias: ")
		leia(dias1)

	     ano = dias1 / 365
	     meses = (dias1 % 365) / 30
	     dias = (dias1 % 365) % 30
	
		escreva ("\nVocê tem ",ano, " anos, ",meses," meses e " ,dias," dias. ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
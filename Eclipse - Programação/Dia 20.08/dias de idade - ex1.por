programa
{
	inclua biblioteca Matematica-->mat
	inclua biblioteca Calendario-->cal
	
	funcao inicio()
	{
	inteiro datual,matual,aatual,dnasc,mnasc,anasc,dias,ano

     escreva ("\nInsira o dia atual: ")
     leia(datual)
     escreva ("\nInsira o mês atual: ")
     leia(matual)
     escreva ("\nInsira o ano atual: ")
     leia(aatual)
     escreva ("\nInsira o dia de nascimento: ")
     leia(dnasc)
     escreva ("\nInsira o mês de nascimento: ")
     leia(mnasc)
     escreva ("\nInsira o ano de nascimento: ")
     leia(anasc)

     ano = (aatual-anasc)
     dias = ano*365

     escreva ("\nVocê tem ",dias, " dias de idade")
     
     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
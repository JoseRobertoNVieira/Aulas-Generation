programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real sf,s,n,E

		escreva("\nInsira o número de horas trabalhadas: ")
		leia(n)

		se(n<50)
		{
		sf=n*10

		escreva("\nSeu sálario é de R$",mat.arredondar(sf,2),".")
		}

		senao se(n>=50)
		{
	     sf=(n*10)
		E=(n-50)
		s=(E*20) + sf

		escreva("\nSeu sálario é de R$",mat.arredondar(s,2),".")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
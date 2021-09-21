programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6],n2[4][6],m1[4][6],m2[4][6],l=0,c=0

		para(l=0;l<4;l++) // N1
		{
			para(c=0;c<6;c++)
			{
				escreva("\nInsira um número: ")
				leia(n1[l][c])
			}
		}
			para(l=0;l<4;l++) // N2
		{
			para(c=0;c<6;c++)
			{
				escreva("\nInsira um número: ")
				leia(n2[l][c])
			}
		}
			para(l=0;l<4;l++) // M1
		{
			para(c=0;c<6;c++)
			{
				m1[l][c] = n1[l][c] + n2[l][c]

                escreva("\nM1: ")
                escreva(m1[l][c])
			}
		}
		escreva("\n")
		para(l=0;l<4;l++) // M2
		{
			para(c=0;c<6;c++)
			{
				m2[l][c] = n1[l][c] - n2[l][c]

                escreva("\nM2: ")
                escreva(m2[l][c])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
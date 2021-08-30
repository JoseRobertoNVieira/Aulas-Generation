programa
{
	
	funcao inicio()
	{
	    real sal,mediaSal,somaSal=0.0,mediaNf,maiorSal=0.0,perc
	    inteiro nf,somaNf=0,cont100=0,x

	    para(x=1;x<=20;x++)
	    {
	    	escreva("\nEntre com o seu sálario: ")
	    	leia(sal)
	    	escreva("\nEntre com a quantidade de filhos: ")
	    	leia(nf)

	    	somaSal += sal
	    	somaNf += nf

	    	se(maiorSal<sal)
	    	{
	    		maiorSal = sal
	    	}

	    	se(sal<=100)
	    	{
	    		cont100++
	    	}
	    }
         mediaSal = somaSal / 20
         mediaNf = somaNf / 20
         perc = (cont100 * 100) / 20

         escreva("\nMédia sálarial: ",mediaSal)
         escreva("\nMédia de filhos: ",mediaNf)
         escreva("\nO maior sálario é de: ",maiorSal)
         escreva("\nPercentual de pessoas que recebem até 100 reais: ",perc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 790; 
 * @PONTOS-DE-PARADA = 21;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
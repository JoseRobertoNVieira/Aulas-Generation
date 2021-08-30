 
programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio () 
	{
		cadeia nome 
                inteiro idade,a,b,c
                real altura,nota1,nota2,nota3,media

                escreva ("\nEntre com o seu nome: ")// Essa linha serve para inserir o nome, usando a função cadeia
                leia (nome)
                escreva ("\nInsira a sua idade: ")// Essa linha serve para inserir a idade, usando a função inteiro
                leia (idade)
                escreva ("\nInsira a sua altura: ")// Essa linha serve para inserir a altura, usando a funcção real
                leia (altura)
                escreva ("\nEscreva a primeira nota: ")
                leia (nota1)
                escreva ("\nEscreva a segunda nota: ")
                leia (nota2)
                escreva ("\nEscreva a terceira nota: ")
                leia (nota3)
                escreva ("\nInsira o valor de A: ")
                leia (a)
                escreva ("\nInsira o valro de B: ")
                leia (b)
                
                
                media = (nota1 + nota2 + nota3) / 3 // média das notas, separar sempre os itens.

                nota1 = mat.raiz(nota2, 2.0) // somente um exemplo

                nota2 = mat.potencia(nota3,3.0) // somente um exemplo

                c = a % b // somente um exemplo
                
 
                escreva ("\nNome: ",nome) // Lê o que o usuário inseriu no campo nome
                escreva ("\nIdade: ",idade)// Lê o que o usuário inseriu no campo idade
                escreva ("\nAltura: ",altura)//Lê o que o usuário inseriu no campo altura
                escreva ("\nMédia das notas: ",mat.arredondar(media,2))//Lê a média das notas, limitado a arrendondar o número, 2 casas depois da virugla
                
               
	} 
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1816; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
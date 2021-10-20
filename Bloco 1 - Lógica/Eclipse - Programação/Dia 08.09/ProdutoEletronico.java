package Dia0809;

import java.text.NumberFormat;

public class ProdutoEletronico {
	
	public String nomeProduto;
	public double valor;
	public int quantidade;
	
	public ProdutoEletronico(int quantidade, String nomeProduto, double valor)
	{
		this.quantidade = quantidade;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}
	
	public void Imprimir()
	{
		System.out.println("\n"+quantidade+" unidades de "+nomeProduto+" custam "+valor+".");
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
	    nf.setMinimumFractionDigits(2);
	    String formatoMoeda = nf.format(valor);
	    return formatoMoeda;
	}
	
}

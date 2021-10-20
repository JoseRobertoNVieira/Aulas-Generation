package Dia0809;

public class Aviao {
	
	public String nomeVoo;
	public String partida;
	public String destino;
	public int numeroPassageiros;
	public double horario;
	
	public Aviao(String nomeVoo, String partida, String destino, double horario, int numeroPassageiros)
	{
		this.nomeVoo = nomeVoo;
		this.partida = partida;
		this.destino = destino;
		this.numeroPassageiros = numeroPassageiros;
		this.horario = horario;
	}
	
	public void Imprimir()
	{
		System.out.println("\nO vôo "+nomeVoo+" com destino à "+destino+", partirá de "+partida+" às "+horario+" horas, levando "+numeroPassageiros+" passageiros");
		
	}

	public String getNomeVoo() {
		return nomeVoo;
	}

	public void setNomeVoo(String nomeVoo) {
		this.nomeVoo = nomeVoo;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public double getHorario() {
		return horario;
	}

	public void setHorario(float horario) {
		this.horario = horario;
	}

}

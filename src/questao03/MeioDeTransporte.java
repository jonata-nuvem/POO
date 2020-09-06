package questao03;

public abstract class MeioDeTransporte {

	private int id;
	private short ano;
	private String modelo;
	private Double carga_maxima;
	
	Terrestre umconsumo = new Terrestre();
	
	public double Consumo (double consumo) {
		return consumo = umconsumo.getPotencia()*carga_maxima*100;
		
	}
}

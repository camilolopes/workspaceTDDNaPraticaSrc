package br.com.camilolopes.bean;


public class ConsumoEletro {
	private static final double DIVISOR = 1000;
	private final int HORADIA = 24;
	private double kwh;
	public double calcularConsumoEletro(int eletroKw, double valorKwh) {		
		
			double tempKwh = eletroKw/DIVISOR;
			kwh = tempKwh * HORADIA;
					
		double valorConsumo = valorKwh * kwh;
		return valorConsumo;
	}

}

package br.com.camilolopes.bean;

import java.math.BigDecimal;

public class Investimento {
		private final double  JUROSMES = 1;
		private BigDecimal valorRegaste = new BigDecimal(0);
	
	public  BigDecimal calculaInvestimento(BigDecimal valor, BigDecimal periodoMes){
		if(periodoMes.intValue()>0){
			BigDecimal jurosTotal = periodoMes.multiply(new BigDecimal(JUROSMES));
			BigDecimal vinvest = valor.multiply(jurosTotal);
			BigDecimal divisaoValor = vinvest.divide(new BigDecimal(100));
			valorRegaste = valor.add(divisaoValor);
			return valorRegaste;
		}
		
		return valor;
	}
	
	
}

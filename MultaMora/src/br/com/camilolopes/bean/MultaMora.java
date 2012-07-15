package br.com.camilolopes.bean;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MultaMora {
	private BigDecimal taxaDia = new BigDecimal(0.33);
	private BigDecimal taxaMaxima = new BigDecimal(20.00);

	public MultaMora() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal verificaAtraso(String dataVencimento, String dataPagamento,
			BigDecimal valor) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		Date dateVenc = df.parse(dataVencimento);
		Date datePagto = df.parse(dataPagamento);
		Calendar calendarVenci = Calendar.getInstance();
			calendarVenci.setTime(dateVenc);
		Calendar calendarPagto = Calendar.getInstance();
			calendarPagto.setTime(datePagto);
		long diferencaData = calendarPagto.getTimeInMillis()
				- calendarVenci.getTimeInMillis();
		int umDia = 1000 * 60 * 60 * 24;
		long diasDiferenca = diferencaData / umDia;
		BigDecimal novoValor = calculaMulta(diasDiferenca,valor);
		return novoValor;
	//	return diasDiferenca;
		
	}

	public BigDecimal calculaMulta(long diasAtrasado, BigDecimal valor) {
		BigDecimal totalTaxa = taxaDia.multiply(new BigDecimal(diasAtrasado));
		
		BigDecimal divisor = new BigDecimal(100);
		double ttaxa = totalTaxa.doubleValue();
		double ttaxamax = taxaMaxima.doubleValue();
		if (ttaxa<=ttaxamax) {
			
			return valor;
		} else {
			BigDecimal valorMulti= valor.multiply(taxaMaxima);
			valorMulti = valorMulti.divide(divisor);
			valor = valorMulti.add(valor);			
			return valor;
		}
		
	}

}

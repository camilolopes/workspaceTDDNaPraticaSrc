package br.com.camilolopes.bean;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Embalagem {

	private Map<String, Double> tabelaPrecoEmbalagem = new LinkedHashMap<String, Double>();
	private double peso = 1;
	private BigDecimal totalFrete = new BigDecimal(17.00);
	private String destinoLocal = "Entrega em 5 dias";

	public Embalagem() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, Double> getTabelaPrecoEmbalagem() {
		tabelaPrecoEmbalagem.put("Embalagem27x22cm", 7.00);
		tabelaPrecoEmbalagem.put("Embalagem36x27cm", 14.00);
		return tabelaPrecoEmbalagem;
	}

	public String prazoDestino(String origem, String pdestino) {
		if (!pdestino.equalsIgnoreCase(origem)) {
			return "Entrega em 15 dias";
		} else {

			return destinoLocal;
		}
	}

	public BigDecimal calculoPreco(double pesoFinal) {
		if (pesoFinal <= peso) {
			double embalagem1 = getTabelaPrecoEmbalagem().get(
					"Embalagem27x22cm");
			totalFrete = totalFrete.add(new BigDecimal(embalagem1));
			return totalFrete;
		} else {
			double mutiplicador = pesoFinal - peso;
			double embalagem2 = getTabelaPrecoEmbalagem().get(
					"Embalagem36x27cm");
			totalFrete = totalFrete.add(new BigDecimal(embalagem2));
			totalFrete = totalFrete.multiply(new BigDecimal(mutiplicador));
			return totalFrete;
		}
	}

}

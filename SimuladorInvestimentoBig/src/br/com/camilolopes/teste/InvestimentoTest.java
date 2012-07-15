package br.com.camilolopes.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.camilolopes.bean.Investimento;

public class InvestimentoTest {

	@Test
	public void testValorInvestidoEsperado() {
		assertEquals(new BigDecimal(1010),
				new Investimento().calculaInvestimento(new BigDecimal(1000),
						new BigDecimal(1)));
	}

	@Test
	public void testValorNEsperado() {
		assertEquals(new BigDecimal(1000),
				new Investimento().calculaInvestimento(new BigDecimal(1000),
						new BigDecimal(0)));
	}

	@Test
	public void testValorInvestidoMaisMeses() {
		assertEquals(new BigDecimal(2040),
				new Investimento().calculaInvestimento(new BigDecimal(2000),
						new BigDecimal(2)));
		assertEquals(new BigDecimal(2080),
				new Investimento().calculaInvestimento(new BigDecimal(2000),
						new BigDecimal(4)));
	}
}

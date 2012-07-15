package br.com.forlinux.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.forlinux.bean.ImpostoRenda;

public class ImpostoRendaTest {

	@Test
	public void testPrecisaDeclararPorRendimento() {
		assertEquals("Você precisa declarar IR.",
				new ImpostoRenda().verificarRendimentos(
						new BigDecimal("2.000"), new BigDecimal("50.000")));
	}

	@Test
	public void testPrecisaDeclararPorPatrimonio() {
		assertEquals("Você precisa declarar IR.",
				new ImpostoRenda().verificarRendimentos(
						new BigDecimal("500.00"), new BigDecimal("400.000")));
	}

	@Test
	public void testNPrecisaDeclararSemRendimento() {
		assertEquals("Você Não precisa declarar IR.",
				new ImpostoRenda().verificarRendimentos(
						new BigDecimal("1.000"), new BigDecimal("0")));
	}

	
}

package br.com.camilolopes.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.camilolopes.bean.ConsumoEletro;

public class ConsumoEletricoTest {

	@Test
	public void testCalculaValorConsumoHora() {
		assertEquals(6.48,new ConsumoEletro().calcularConsumoEletro(900, 0.30),0.01);
		assertEquals(12.95,new ConsumoEletro().calcularConsumoEletro(1200, 0.45),0.01);
	}

	
}

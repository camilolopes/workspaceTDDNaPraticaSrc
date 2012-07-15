package br.com.camilolopes.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.ParseException;

import org.junit.Test;

import br.com.camilolopes.bean.MultaMora;

public class MultaMoraTeste {

	@Test
	public void testPeriodoValidoMes() throws ParseException {
		assertEquals(new BigDecimal(120), new MultaMora().verificaAtraso(
				"10/11/2010", "20/01/2011", new BigDecimal(100)));
	}
	@Test
	public void testCalculaValor(){
		BigDecimal testValor = new MultaMora().calculaMulta(1, new BigDecimal(3));
		assertEquals(new BigDecimal(3),testValor);
	} 

}

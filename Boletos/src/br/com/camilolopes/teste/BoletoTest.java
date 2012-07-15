package br.com.camilolopes.teste;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

import br.com.camilolopes.bean.Boleto;

public class BoletoTest {
@Test
	public void testPagoEmDias() throws ParseException  {
	assertEquals(0, new Boleto().verificaPgto("09/12/2010","09/12/2010"));
	}
@Test
	public void testPagoAntecipado() throws ParseException{
		assertEquals("Antecipado ",-2, new Boleto().verificaPgto("10/12/2010", "08/12/2010"));
	}
	
@Test
	public void testPagoEmAnoDiferenteAntecipado() throws ParseException{
		assertEquals("Antecipado ",-1, new Boleto().verificaPgto("01/01/2011","31/12/2010"));
	}
@Test 
	public void testPagoAposVencimento() throws ParseException{
		assertEquals("Atraso de ",2 , new Boleto().verificaPgto("20/11/2010", "22/11/2010"));
	}
}

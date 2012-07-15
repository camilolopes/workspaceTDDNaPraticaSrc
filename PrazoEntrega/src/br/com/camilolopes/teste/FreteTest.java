package br.com.camilolopes.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.camilolopes.bean.Frete;


public class FreteTest {

	
	@Test
	public void testPrazoEntregaLocal(){
		assertEquals("Entrega em 5 dias", new Frete().prazoDestino("SP", "sp"));
	}
	
	@Test
	public void testPrazoEntregaForaEstado(){
		assertEquals("Entrega em 15 dias", new Frete().prazoDestino("BA", "SP"));
	}
}

package br.com.camilolopes.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.camilolopes.bean.Embalagem;


public class EmbalagemTest {

	@Test
	public void testCalcularFreteAcimaUmKg(){
		assertEquals("Valor do Frete: ",new BigDecimal(62),new Embalagem().calculoPreco(3));
	}
	
	@Test
	public void testCalculaFreteAteUmKg(){
		assertEquals("Valor do Frete: ",new BigDecimal(24), new Embalagem().calculoPreco(1));
	}
	
	@Test
	public void testPrazoEntregaLocal(){
		assertEquals("Entrega em 5 dias", new Embalagem().prazoDestino("SP", "sp"));
	}
	
	@Test
	public void testPrazoEntregaForaEstado(){
		assertEquals("Entrega em 15 dias", new Embalagem().prazoDestino("BA", "SP"));
	}
}

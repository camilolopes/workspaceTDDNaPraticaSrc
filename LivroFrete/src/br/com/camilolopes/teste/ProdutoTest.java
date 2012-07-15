package br.com.camilolopes.teste;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;

import org.junit.Test;

import br.com.camilolopes.bean.Produto;

public class ProdutoTest {

	@Test
	public void testCalculaFreteLivroLocalmente() {
		LinkedHashSet<Produto> cestaLivro = new LinkedHashSet<Produto>();
		cestaLivro.add(new Produto(0, "Guia do exame SCJP", 1));
		assertEquals("Entrega em 5 dias",
				new Produto().checkout(cestaLivro, "SP", "SP"));
	}

	@Test
	public void testCalculaFreteLocalDiferente() {
		LinkedHashSet<Produto> cestaLivro = new LinkedHashSet<Produto>();
		cestaLivro.add(new Produto(0, "Guia do exame SCJP", 1));
		cestaLivro.add(new Produto(1, "Dominando Hibernate", 2));
		assertEquals("Entrega em 15 dias",
				new Produto().checkout(cestaLivro, "BA", "SP"));
	}

	@Test
	public void testCaculaFreteMenosUmKg() {
		LinkedHashSet<Produto> cestaLivro = new LinkedHashSet<Produto>();
		cestaLivro.add(new Produto(0, "Guia do exame SCJP", 0.500));
		assertEquals("Entrega em 5 dias",
				new Produto().checkout(cestaLivro, "SP", "SP"));

	}

	@Test
	public void testCalculaMaisUmKg() {
		LinkedHashSet<Produto> cestaLivro = new LinkedHashSet<Produto>();
		cestaLivro.add(new Produto(0, "Guia do exame SCJP", 1));
		cestaLivro.add(new Produto(1, "Dominando Hibernate", 2));
		cestaLivro.add(new Produto(3, "TomCat Administrador", 1));
		cestaLivro.add(new Produto(4, "Core JSF 2.0", 1));
		cestaLivro.add(new Produto(5, "Certificação LPI", 1));
		assertEquals("Entrega em 5 dias",
				new Produto().checkout(cestaLivro, "RJ", "rj"));
	}

}

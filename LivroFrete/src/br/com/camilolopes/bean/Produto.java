package br.com.camilolopes.bean;

import java.util.LinkedHashSet;
import java.util.Set;

public class Produto {
	private int idcodigo;
	private String titulo;
	private double pesoKg;
	private Set<Produto> cestaLivros = new LinkedHashSet<Produto>();
	private Frete frete;
	private String prazo;
	private double pesoCesta;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(int id, String titulo, double pesoKg) {
		super();
		this.idcodigo = id;
		this.titulo = titulo;
		this.pesoKg = pesoKg;
	}

	public Set<Produto> getCestaLivros() {
		return cestaLivros;
	}

	public void setCestaLivros(LinkedHashSet<Produto> livroAdded) {
		cestaLivros = livroAdded;

	}

	public double getPesoCesta() {
		for (Produto cestaL : getCestaLivros()) {
			pesoCesta += cestaL.pesoKg();
		}

		return pesoCesta;
	}

	public String checkout(LinkedHashSet<Produto> livro, String orig, String dest) {
		return null;
	}

	public int getId() {
		return idcodigo;
	}

	public void setId(int id) {
		this.idcodigo = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double pesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double peso) {
		this.pesoKg = peso;
	}

}

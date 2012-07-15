package br.com.camilolopes.bean;

import java.util.LinkedHashSet;
import java.util.Set;

public class Livro {
	private int idcodigo;
	private String titulo;
	private double pesoKg;
	private Set<Livro> cestaLivros = new LinkedHashSet<Livro>();
	private Frete frete;
	private String prazo;
	private double pesoCesta;

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(int id, String titulo, double pesoKg) {
		super();
		this.idcodigo = id;
		this.titulo = titulo;
		this.pesoKg = pesoKg;
	}

	public Set<Livro> getCestaLivros() {
		return cestaLivros;
	}

	public void setCestaLivros(LinkedHashSet<Livro> livroAdded) {
		cestaLivros = livroAdded;

	}

	public double getPesoCesta() {
		for (Livro cestaL : getCestaLivros()) {
			pesoCesta += cestaL.pesoKg();
		}

		return pesoCesta;
	}

	public String checkout(LinkedHashSet<Livro> livro, String orig, String dest) {
		frete = new Frete();
		setCestaLivros(livro);
		prazo = frete.prazoDestino(orig, dest);
		String checkout =  prazo;
		return checkout;
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

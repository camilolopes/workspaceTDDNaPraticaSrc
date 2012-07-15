package br.com.camilolopes.bean;


public class Frete {
	
	private String destinoLocal = "Entrega em 5 dias";

	public Frete() {
		// TODO Auto-generated constructor stub
	}

	public String prazoDestino(String origem, String pdestino) {
		if (!pdestino.equalsIgnoreCase(origem)) {
			return "Entrega em 15 dias";
		} else {

			return destinoLocal;
		}
	}

	

}

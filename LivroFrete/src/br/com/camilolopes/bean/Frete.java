package br.com.camilolopes.bean;


public class Frete {
	
	private String destinoLocal = "Entrega em 5 dias";

	public Frete() {
		
	}

	public String prazoDestino(String origem, String pdestino) {
		if (!pdestino.equalsIgnoreCase(origem)) {
			return "";
		} else {
			return destinoLocal;
		}
	}

	

}

package br.com.camilolopes.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Boleto {
	private int diaPgto;
	private String data;

	public int getDiaPgto() {
		return diaPgto;
	}

	public long verificaPgto(String vencimento, String pgto)
			throws ParseException {
		
		return 0;
	}

	public void setDiaPgto(int diaPgto) {
		this.diaPgto = diaPgto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}

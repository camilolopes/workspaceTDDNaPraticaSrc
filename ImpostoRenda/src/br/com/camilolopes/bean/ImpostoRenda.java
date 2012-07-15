package br.com.camilolopes.bean;

import java.math.BigDecimal;

public class ImpostoRenda {
	private final int ANO = 12;
	private String msgDeclarar= "Você precisa declarar IR.";
	private String msgNDeclarar = "Você Não precisa declarar IR.";
	
	private final double rendAnualIr =17.215;
	private final double patrimoniocomp = 300.000;

	public String verificarRendimentos(BigDecimal salarioMensal, BigDecimal vPatrimonioComprado) {
		BigDecimal tempAnual = rendAnual(salarioMensal); 		
		
		if(tempAnual.doubleValue()>  rendAnualIr || vPatrimonioComprado.doubleValue() > patrimoniocomp ){		
		return msgDeclarar;
		}
		else {			
			return msgNDeclarar;
		}
	}
	
	public BigDecimal rendAnual(BigDecimal salariom){
		BigDecimal rendAnual = salariom.multiply(new BigDecimal(ANO)); 
		
		return rendAnual; 
	}

}

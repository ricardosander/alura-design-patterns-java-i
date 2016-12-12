package br.com.alura.designpatterns.impostos;

public class ICMS {

	public double calculaICMS(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}

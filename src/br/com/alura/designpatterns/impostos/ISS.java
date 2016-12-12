package br.com.alura.designpatterns.impostos;

public class ISS {

	public double calculaISS(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}

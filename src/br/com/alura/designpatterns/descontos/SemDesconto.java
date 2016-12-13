package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setDesconto(Desconto desconto) {}

}

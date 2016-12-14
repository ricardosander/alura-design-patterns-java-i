package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public class DescontoValorQuinhentos extends Desconto {

	@Override
	protected boolean aplica(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	protected double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

}

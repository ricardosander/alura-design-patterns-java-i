package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public class Desconto5Itens extends Desconto {

	@Override
	protected boolean aplica(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}

	@Override
	protected double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}

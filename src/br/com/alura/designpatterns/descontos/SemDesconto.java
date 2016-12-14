package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public class SemDesconto extends Desconto {

	public double calcula(Orcamento orcamento) {
		return 0;
	}

	@Override
	protected boolean aplica(Orcamento orcamento) {
		return true;
	}

}

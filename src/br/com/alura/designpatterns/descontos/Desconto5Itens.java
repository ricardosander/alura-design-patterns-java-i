package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public class Desconto5Itens implements Desconto {

	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {
		
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return this.proximo.desconto(orcamento);
	}

	@Override
	public void setDesconto(Desconto desconto) {
		this.proximo = desconto;
	}

}

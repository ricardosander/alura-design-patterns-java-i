package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public class DescontoValorQuinhentos implements Desconto {

	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {
		
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		return this.proximo.desconto(orcamento);
	}

	@Override
	public void setDesconto(Desconto desconto) {
		this.proximo = desconto;
	}

}

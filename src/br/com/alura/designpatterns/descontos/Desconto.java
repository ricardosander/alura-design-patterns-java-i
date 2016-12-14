package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public abstract class Desconto {

	private Desconto proximo;

	public final double desconto(Orcamento orcamento) {
		
		if (this.aplica(orcamento)) {
			return this.calcula(orcamento);
		}
		
		if (this.proximo != null) {
			return this.proximo.desconto(orcamento);
		}
		
		return 0.0;
	}
	
	protected abstract boolean aplica(Orcamento orcamento);
	
	protected abstract double calcula(Orcamento orcamento);
	
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
}

package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Item;
import br.com.alura.designpatterns.impostos.Orcamento;

public class DescontoCombinacaoItem implements Desconto {

	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {
		
		if (this.existe("LAPIS", orcamento) && this.existe("CANETA", orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		
		return this.proximo.desconto(orcamento);
	}

	@Override
	public void setDesconto(Desconto desconto) {
		this.proximo = desconto;
	}

	private boolean existe(String nomeItem, Orcamento orcamento) {
		
		nomeItem = nomeItem.trim().toLowerCase();
		for (Item item : orcamento.getItens()) {
			if (item.getNome().trim().toLowerCase().equals(nomeItem)) {
				return true;
			}
		}
		return false;
	}
}

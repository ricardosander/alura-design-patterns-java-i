package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Item;
import br.com.alura.designpatterns.impostos.Orcamento;

public class DescontoCombinacaoItem extends Desconto {

	@Override
	protected boolean aplica(Orcamento orcamento) {
		return this.existe("LAPIS", orcamento) && this.existe("CANETA", orcamento);
	}

	@Override
	protected double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
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

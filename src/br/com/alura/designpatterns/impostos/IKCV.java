package br.com.alura.designpatterns.impostos;

public class IKCV extends TemplateImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean aplicaMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor() <= 500) {
			return false;
		}
		return this.temItemValorMaiorQue100(orcamento);
	}

	private boolean temItemValorMaiorQue100(Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			
			if (item.getValor() > 100) {
				return true;
			}
		}
		
		return false;
	}

}

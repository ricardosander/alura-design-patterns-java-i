package br.com.alura.designpatterns.impostos;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean aplicaMaximaTaxacao(Orcamento orcamento) {

		for (int i = 0; i < orcamento.getItens().size() -1; i++) {
			
			for (int j = i + 1; j < orcamento.getItens().size(); j++) {
				
				if (orcamento.getItens().get(i).getNome().equals(orcamento.getItens().get(j).getNome())) {
					return true;
				}
			}
		}
		
		return false;
	}

}

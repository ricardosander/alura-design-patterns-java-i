package br.com.alura.designpatterns.investimento;

public class RealizadorDeInvestimentos {

	public void realizaInvestimento(Conta conta, Investimento investimento) {
		
		double lucro = investimento.investir(conta);
		conta.deposita(lucro * 0.75); 
	}
}

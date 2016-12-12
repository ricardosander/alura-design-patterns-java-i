package br.com.alura.designpatterns.investimento;

public class Conservador implements Investimento {

	@Override
	public double investir(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}

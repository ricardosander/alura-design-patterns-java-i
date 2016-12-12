package br.com.alura.designpatterns.investimento;

import java.util.Random;

public class Moderado implements Investimento {

	private Random random;

	public Moderado() {
		this.random = new Random();
	}
	
	@Override
	public double investir(Conta conta) {
		
		if (this.random.nextInt(2) == 0) {
			return conta.getSaldo() * 0.025;
		}
		return conta.getSaldo() * 0.007;
	}

}

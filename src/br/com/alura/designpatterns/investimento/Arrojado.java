package br.com.alura.designpatterns.investimento;

import java.util.Random;

public class Arrojado implements Investimento {

	private Random random;

	public Arrojado() {
		this.random = new Random();
	}
	
	@Override
	public double investir(Conta conta) {

		double chance = this.random.nextInt(10);
		if (chance <= 1) {
			return conta.getSaldo() * 0.05;
		} else if (chance <= 4) {
			return conta.getSaldo() * 0.03;
		}
		return conta.getSaldo() * 0.006;
	}

}

package br.com.alura.designpatterns.investimento;

public class Conta {

	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double deposito) {
		this.saldo += deposito;
	}
}

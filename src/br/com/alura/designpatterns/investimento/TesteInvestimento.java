package br.com.alura.designpatterns.investimento;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		Conservador conservador = new Conservador();
		Moderado moderado = new Moderado();
		Arrojado arrojado = new Arrojado();
		
		Conta conta1 = new Conta(100);
		Conta conta2 = new Conta(100);
		Conta conta3 = new Conta(100);
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realizaInvestimento(conta1, conservador);
		realizadorDeInvestimentos.realizaInvestimento(conta2, moderado);
		realizadorDeInvestimentos.realizaInvestimento(conta3, arrojado);
		
		System.out.println("Conta 1: " + conta1.getSaldo());
		System.out.println("Conta 2: " + conta2.getSaldo());
		System.out.println("Conta 3: " + conta3.getSaldo());
	}
}

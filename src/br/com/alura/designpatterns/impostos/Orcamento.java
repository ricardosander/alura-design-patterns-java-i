package br.com.alura.designpatterns.impostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private final List<Item> itens;
	private double valor;

	public Orcamento() {
		this.itens = new ArrayList<>();
	}
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
	}
	
	public double getValor() {
		return valor;
	}

	public void adiciona(Item item) {
		
		this.valor += item.getValor();
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
}

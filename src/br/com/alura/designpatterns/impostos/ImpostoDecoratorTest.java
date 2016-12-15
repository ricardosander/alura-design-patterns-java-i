package br.com.alura.designpatterns.impostos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImpostoDecoratorTest {

	@Test
	public void impostosCompostos() {
		
		Orcamento orcamento = new Orcamento(500);
		
		Imposto impostoComposto = new ICCC(new ISS(new ICMS()));
		assertEquals(130.0, impostoComposto.calcula(orcamento), 0.00001);
	}
	
	@Test
	public void impostosCompostosComCondidional() {
		
		Orcamento orcamento = new Orcamento(500);
		
		Imposto impostoComposto = new ICPP(new IKCV(new ICCC(new ISS(new ICMS()))));
		assertEquals(195.0, impostoComposto.calcula(orcamento), 0.00001);
	}

}

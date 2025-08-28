package br.com.mariojp.solid.ocp;

// Política para clientes regulares (sem desconto)
public class RegularDiscountPolicy implements DiscountPolicy {
	@Override
	public double apply(double amount) {
		// Cliente regular: sem desconto
		return amount;
	}

}

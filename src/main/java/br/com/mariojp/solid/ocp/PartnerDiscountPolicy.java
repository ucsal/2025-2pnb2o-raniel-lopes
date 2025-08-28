package br.com.mariojp.solid.ocp;

public class PartnerDiscountPolicy implements DiscountPolicy {
	@Override
	public double apply(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.88;
	}
}

package br.com.mariojp.solid.ocp;

import java.util.EnumMap;
import java.util.Map;

// Calculadora simples que delega para a política de desconto conforme o tipo de cliente
public class DiscountCalculator {
    private final Map<CustomerType, DiscountPolicy> policies;

    public DiscountCalculator() {
        this.policies = new EnumMap<>(CustomerType.class);
        this.policies.put(CustomerType.REGULAR, new RegularDiscountPolicy());
        this.policies.put(CustomerType.PREMIUM, new PremiumDiscountPolicy());
        this.policies.put(CustomerType.PARTNER, new PartnerDiscountPolicy());
    }

    public double apply(double amount, CustomerType customerType) {
        DiscountPolicy policy = policies.getOrDefault(customerType, new RegularDiscountPolicy());
        return policy.apply(amount);
    }
}

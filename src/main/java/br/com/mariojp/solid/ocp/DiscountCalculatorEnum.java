package br.com.mariojp.solid.ocp;

import java.util.Map;

// Calculadora que usa enum como tipo de cliente
public class DiscountCalculatorEnum {
    private Map<CustomerType, DiscountPolicy> policies;

    public DiscountCalculatorEnum(Map<CustomerType, DiscountPolicy> policies) {
        this.policies = policies;
    }

    public double calculate(CustomerType customerType, double amount) {
        DiscountPolicy policy = policies.getOrDefault(customerType, new RegularDiscountPolicy());
        return policy.apply(amount);
    }
}
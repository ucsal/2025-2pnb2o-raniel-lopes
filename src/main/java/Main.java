
import java.util.HashMap;
import java.util.Map;

import br.com.mariojp.solid.ocp.CustomerType;
import br.com.mariojp.solid.ocp.DiscountCalculatorEnum;
import br.com.mariojp.solid.ocp.DiscountPolicy;
import br.com.mariojp.solid.ocp.PartnerDiscountPolicy;
import br.com.mariojp.solid.ocp.PremiumDiscountPolicy;
import br.com.mariojp.solid.ocp.RegularDiscountPolicy;

public class Main {
    public static void main(String[] args) {
        // Cria o mapa de políticas usando o enum como chave
        Map<CustomerType, DiscountPolicy> policies = new HashMap<>();
        policies.put(CustomerType.REGULAR, new RegularDiscountPolicy());
        policies.put(CustomerType.PREMIUM, new PremiumDiscountPolicy());
        policies.put(CustomerType.PARTNER, new PartnerDiscountPolicy());

        // Instancia o calculador de desconto
        DiscountCalculatorEnum calculator = new DiscountCalculatorEnum(policies);

        // Testa para cada tipo de cliente
        System.out.println("Regular: " + calculator.calculate(CustomerType.REGULAR, 100)); // 100.0
        System.out.println("Premium: " + calculator.calculate(CustomerType.PREMIUM, 100)); // 90.0
        System.out.println("Partner: " + calculator.calculate(CustomerType.PARTNER, 100)); // 88.0
        System.out.println("Outro: " + calculator.calculate(null, 100)); // 100.0 (default)
    }
}
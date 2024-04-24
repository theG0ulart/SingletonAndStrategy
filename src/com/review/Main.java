package com.review;

import com.review.singleton.Logger;
import com.review.strategy.CreditCardPaymentStrategy;
import com.review.strategy.PayPalPaymentStrategy;
import com.review.strategy.PaymentStrategy;
import com.review.strategy.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Criando o carrinho de compras
        ShoppingCart cart = new ShoppingCart();

        // Definindo a estratégia de pagamento como cartão de crédito
        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy("1234567890123456", "12/24", "123");
        cart.setPaymentStrategy(creditCardPayment);

        // Simulando o checkout
        cart.checkout(100.0f);

        // Mudando a estratégia de pagamento para PayPal
        PaymentStrategy paypalPayment = new PayPalPaymentStrategy("example@example.com", "password");
        cart.setPaymentStrategy(paypalPayment);

        // Simulando outro checkout
        cart.checkout(200.0f);
    }
   }

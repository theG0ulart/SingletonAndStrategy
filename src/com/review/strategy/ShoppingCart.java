package com.review.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(float totalAmount) {
        // Processa o pagamento usando a estratégia selecionada
        paymentStrategy.pay(totalAmount);
    }
}

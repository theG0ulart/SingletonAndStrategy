package com.review.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paying " + amount + " using credit card.");
        // Lógica de pagamento com cartão de crédito
    }
}

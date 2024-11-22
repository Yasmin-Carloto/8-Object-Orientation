package org.maisprati.abstraction.paymentWays;

abstract public class PaymentWays {
    // processarPagamento(double valor)
    abstract public void processPayment(double value);

    // validarPagamento()
    abstract protected boolean toValidPayment();
}

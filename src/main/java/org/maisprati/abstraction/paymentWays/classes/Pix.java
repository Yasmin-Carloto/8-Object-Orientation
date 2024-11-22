package org.maisprati.abstraction.classes;

import org.maisprati.abstraction.paymentWays.PaymentWays;

public class Pix extends PaymentWays {
    private String pixKey;

    public Pix(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public void processPayment(double value) {
        if(toValidPayment()){
            System.out.println("Processing pix payment in amount R$" + value);
        } else {
            System.out.println("Pix payment in amount R$" + value + " is now canceled.");
        }
    }

    @Override
    protected boolean toValidPayment() {
        return this.validatePixKey();
    }

    private boolean validatePixKey(){
        return !this.pixKey.equals(" ");
    }
}

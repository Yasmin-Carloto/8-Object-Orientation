package org.maisprati.abstraction.classes;

import org.maisprati.abstraction.paymentWays.PaymentWays;

public class Ticket extends PaymentWays {
    private String barcode;

    public Ticket(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public void processPayment(double value) {
        if(toValidPayment()){
            System.out.println("Processing ticket payment in amount R$" + value);
        } else {
            System.out.println("Ticket payment in amount R$" + value + " is now canceled.");
        }
    }

    @Override
    protected boolean toValidPayment() {
        return validateBarcode();
    }

    private boolean validateBarcode(){
        if(this.barcode.length() == 48){
            System.out.println("Barcode " + this.barcode + " is valid!");
            return true;
        } else {
            System.out.println("Barcode " + this.barcode + " invalid!");
            return false;
        }
    }
}

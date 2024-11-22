package org.maisprati.abstraction.paymentWays.classes;

import org.maisprati.abstraction.paymentWays.PaymentWays;

public class CreditCard extends PaymentWays {
    private String cardNumber;
    private String dateOfValidation;
    private String cvv;

    public CreditCard(String cardNumber, String dateOfValidation, String cvv) {
        this.cardNumber = cardNumber;
        this.dateOfValidation = dateOfValidation;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double value) {
        if(toValidPayment()){
            System.out.println("Processing credit card payment in amount R$" + value);
        } else {
            System.out.println("Credit card payment in amount R$" + value + " is now canceled.");
        }
    }

    @Override
    protected boolean toValidPayment() {
        return validCreditCardCvv() && validCreditCardDate() && validCreditCardNumber();
    }

    private boolean validCreditCardNumber(){
        if(this.cardNumber.length() == 16){
            System.out.println("Credit card number " + this.cardNumber + " is valid!");
            return true;
        } else {
            System.out.println("Card number invalid!");
            return false;
        }
    }

    private boolean validCreditCardDate(){
        if(this.dateOfValidation.equals("11/2024")){
            System.out.println("Date of validation from card " + this.dateOfValidation + " is valid!");
            return true;
        } else {
            System.out.println("Date of validation invalid!");
            return false;
        }
    }

    private boolean validCreditCardCvv(){
        if(this.cvv.length() == 3){
            System.out.println("Cvv " + this.cvv + " is valid!");
            return true;
        } else {
            System.out.println("Cvv number invalid!");
            return false;
        }
    }
}

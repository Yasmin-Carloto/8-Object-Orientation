package org.maisprati.encapsulation;

public class Computer extends Product {
    public Computer(String name, float price, int quantity) {
        super(name, price, quantity);
    }

    // aplicarDesconto()
    public void applyDiscount(double percentage){
        if (percentage >= 50){
            throw new IllegalArgumentException("Discount must be less or equl to 50%");
        } else if(percentage < 0){
            throw new IllegalArgumentException("Percentage must be positive, greater than 0.");
        }

        double discountValue = ((percentage / 100) * this.getPrice());
        setPrice(this.getPrice() - discountValue);
    }
}

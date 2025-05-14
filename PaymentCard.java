public class PaymentCard {
    private double balance;

    // Constructor with the opening balance as the parameter
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    // Method to return the String sentence of the balance
    public String toString() {
        return "The card has a balance of " + this.balance + " euros.";
    }


    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
    }

    // Top up the balance as long as the amount is less than 0 and the total not exceeding 150 to prevent from negatve balance
    public void addMoney(double amount) {
        double total = this.balance + amount;

        if(amount > 0 && total < 150) {
            this.balance = total;
        }
    }
}

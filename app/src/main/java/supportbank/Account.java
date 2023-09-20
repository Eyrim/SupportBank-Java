package supportbank;

import java.math.BigDecimal;

public class Account {
    // The owner of the account
    private final String name;
    // The balance of the account
    private BigDecimal balance;

    public Account(String name, BigDecimal amount) {
        this.name = name;
        this.balance = amount;
    }

    public Account(String name) {
        this.name = name;
        this.balance = new BigDecimal(0);
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    /**
     * Adds to the balance of the account
     * @param amount The amount to add
     */
    public void addToBalance(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    /**
     * Subtracts from the balance of the account
     * @param amount The amount to subtract
     */
    public void subtractFromBalance(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }
}

package supportbank;

import java.math.BigDecimal;

public class Account {
    private final String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal amount) {
        this.name = name;
        this.balance = amount;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void addToBalance(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void removeFromBalance(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }
}

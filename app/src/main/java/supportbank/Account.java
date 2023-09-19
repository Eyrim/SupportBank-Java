package supportbank;

import java.math.BigDecimal;
import java.util.List;

public class Account {
    private final String name;
    private BigDecimal balance = new BigDecimal(0);

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void addToBalance(BigDecimal amount) {
//        this.balance += amount;
//        this.balance = this.balance.add(amount);
         BigDecimal d = this.balance.add(amount);
         this.balance = d;
    }

    public void removeToBalance(BigDecimal amount) {
//        this.balance -= amount;
        this.balance = this.balance.subtract(amount);
    }
}

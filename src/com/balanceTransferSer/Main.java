package com.balanceTransferSer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

    }
}

class Account {
    int id;
    Money balance;

    public Account(int id, Money balance) {
        this.balance = balance;
        this.id = id;
    }
}

class BalanceTransferService {
    void transfer(Account from, Account to, Money amount) {
        if (from.id == to.id) {
            throw new IllegalArgumentException("Cannot transfer to the same account");
        }
        from.balance.subtract(amount);
        to.balance.add(amount);
    }
}

class Money {
    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalStateException("Money cannot be negative");
        }
        this.amount = amount;
    }

    public Money add(Money other) {
        return new Money(this.amount.add(other.amount));
    }

    public Money subtract(Money other) {
        BigDecimal result = this.amount.add(other.amount);
        if (result.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalStateException("Insufficient founds");
        }
        return new Money(result);
    }
}


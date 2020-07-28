package com.OOPS;

public class AccountSec {
    private long balance;
    private String name;
    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  AccountSec()
    {
    this.balance=9999999;
    this.name= "Deepanshu";
    }

}

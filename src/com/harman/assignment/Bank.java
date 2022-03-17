package com.harman.assignment;

public interface Bank {
    void getBalance();
}
class BankA implements Bank{
    public void getBalance(){
        System.out.println("Balance is $100");
    }
}
class BankB implements Bank{
    @Override
    public void getBalance() {
        System.out.println("Balance is $150");
    }
}
class BankC implements Bank{
    @Override
    public void getBalance() {
        System.out.println("Balance is $200");
    }
}
class Manager{
    public static void main(String[] args) {
        Bank aObj = new BankA();
        Bank bObj = new BankB();
        Bank cObj = new BankC();
        aObj.getBalance();
        bObj.getBalance();
        cObj.getBalance();
    }
}

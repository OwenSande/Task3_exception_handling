package com.company;

public class Account {
    private  String ownerSande56272;
    private  String accountNumberSande56272;
    private  int balanceSande56272;

    public  Account(String ownerSande56272, int balanceSande56272, String accountNumberSande56272){
        this.ownerSande56272 = ownerSande56272;
        this.balanceSande56272 = balanceSande56272;
        this.accountNumberSande56272 = accountNumberSande56272;

    }

    public String getOwnerSande56272() {
        return ownerSande56272;
    }

    public String getAccountNumberSande56272() {
        return accountNumberSande56272;
    }

    public int getBalanceSande56272() {
        return balanceSande56272;
    }

    public void setOwnerSande56272(String ownerSande56272) {
        this.ownerSande56272 = ownerSande56272;
    }

    public void setAccountNumberSande56272(String accountNumberSande56272) {
        this.accountNumberSande56272 = accountNumberSande56272;
    }

    public void setBalanceSande56272(int balanceSande56272) {
        this.balanceSande56272 = balanceSande56272;
    }

    public void withdraw (int amountSande56272) throws NotEnoughMoneyException{
        if (balanceSande56272 >= amountSande56272){

            balanceSande56272 = balanceSande56272 - amountSande56272 ;

        }else {

            System.out.println("There is not enough money in the account. ");
            throw new NotEnoughMoneyException("Not enough money in the account ");
        }
    }
}

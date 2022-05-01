package com.company;

public class Main {

    public static void main(String[] args) {

        Account newAccount1 = new Account("Owen Sande",1000,"78778");

        try {

            newAccount1.withdraw(500);

        }catch (NotEnoughMoneyException ex){

            System.out.println(ex);
            ex.printStackTrace();

        }catch (Exception ex){


        }finally {

            System.out.println("The account balance is " + newAccount1.getBalanceSande56272());
        }

    }
}

package com.company;

import java.util.PrimitiveIterator;
import java.util.Scanner;

class MinimumAmountException  extends Exception {
    @Override
    public String toString() {
        return "Please enter the correct amount ";
    }
}

class InsufficientBalanceException extends Exception {
    @Override
    public String toString() {
        return "You do not have sufficient Balance for the Transaction";
                                          }
}
class ATM_Methods {
    public void cashWidraw() throws MinimumAmountException, InsufficientBalanceException {
        System.out.println("Enter Amount (Min 500) ");
        Scanner sc = new Scanner(System.in);
        int Amount = sc.nextInt();
        try {
            if (Amount<500){
                throw new MinimumAmountException();
            }
            else if (Amount < 1000) {
                throw new InsufficientBalanceException();

            }
        }
        catch (MinimumAmountException e){
            System.out.println(e.toString());
        }
    }

    public void CheckBalance(){
        System.out.println("Your available balance is 0.00");

    }

    public void PayBill() throws InsufficientBalanceException{
        System.out.println("Enter Bill Amount");
        Scanner scanner = new Scanner(System.in);
        int Amount = scanner.nextInt();
        if (Amount<300){
            throw new InsufficientBalanceException();
        }
        else {
            System.out.println("Your Bill has been paid ");
        }

    }
}

class ATM extends ATM_Methods {

    private String BranchName;
    private String ATM_Company;
    private String ATM_Owner;


    public void ATM (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Pin ");
        int Pin = sc.nextInt();
    }

}
public class Abstraction_ATM_Example {
    public static void main(String[] args) {
        ATM use = new ATM();
        use.ATM();
        try {
            use.cashWidraw();
        }
        catch (MinimumAmountException e) {
            System.out.println("Please Enter Amount More then 500");
        }
        catch (InsufficientBalanceException e) {
            System.out.println("You have insufficient Balance");
        }

        try {
            use.PayBill();
        }
        catch (InsufficientBalanceException e) {
            System.out.println("You do not have suffecient Balance");
        }

    }
}

package com.company;

import java.util.Scanner;
class CoffeeMachine {

    private String Gradients;
    private String InternalMechanism;

    public String getGradients() {
        return Gradients;
    }

    public void setGradients(String gradients) {
        Gradients = "Milk + coffee + Water";
    }

    public String getInternalMechanism() {
        return InternalMechanism;
    }

    public void setInternalMechanism(String internalMechanism) {
        InternalMechanism = internalMechanism;
    }

    public void Start( ){
//        System.out.println(Gradients);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coffee name that you want ");
        String coffee = sc.next();
        System.out.println("please wait");
        System.out.println("Your Coffee is Ready For Drink ");
    }


}

public class Abstraction_Example_In_Real_Life {
    public static void main(String[] args) {
        // we only have to know after press the start button Coffee will be made
        CoffeeMachine coffee = new CoffeeMachine();
        coffee.Start();

        //  Abstraction
        //         we dont have to know which gradients are used in the machine

        //        coffee.setGradients("Milk + coffee + Water");
        //        System.out.println("Coffee Gradient is: "+ coffee.getGradients());

        //  Abstraction
        //       we dont have to know how to machine work internally

        //       coffee.setInternalMechanism("Machine works like a Motor");
        //       System.out.println(coffee.getInternalMechanism());



    }
}

package com.company;
import javax.naming.Name;

abstract class BasicOfBowling {
    public void runUp(){
        System.out.println(" Running \t (Basic concept)");
    }
    public void lockTarget(){
        System.out.println("Target Stumps \t (Base concept)");
    }
    public void jump(){
        System.out.println("Normal Jumping \t (Base concept)");
    }
    public void ThrowBall (){
        System.out.println("Throwing Bowl to Stumps \t (Base Class )");
    }

}

class Furqan extends BasicOfBowling{

    public void runUp() {
        System.out.println("Running with the starts of jump (FK characteristic) ");
    }

    @Override
    public void jump() {
        System.out.println("Small Jump (FK characteristic)");
    }
}
public class FK_Problem {
    public static void main(String[] args) {
        BasicOfBowling FK = new Furqan();
        FK.runUp();
        FK.lockTarget();
        FK.jump();
        FK.ThrowBall();

    }
}

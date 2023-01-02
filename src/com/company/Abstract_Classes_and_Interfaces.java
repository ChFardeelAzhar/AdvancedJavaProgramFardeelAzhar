package com.company;
/*
Q1. When to use abstract class in java ?
Ans : when we have to share same code , data , methods to other classes like


abstract class Human {
    abstract  void eat();
}

class Doctor extends Human {
  @Override
    public void eat(){
        System.out.println("I can eat ");
    }
}

class labour extends Human {

    @Override
    public void eat(){
        System.out.println("I can also eat ");
    }
}

class Engineer extends Human {

    @Override
    void eat() {
        System.out.println("hello every one i am engineer and i also can eat ");
    }
}

 */


/*
Q2.when we use abstract method in java ?
Ans: when same method have to perform different tasks then we use abstract methods in java
Like example below : All the Classes of Special list use only one abstract method 'SpeciallistIn'
conditions in which where we need same method with different behavior. we use abstract method



abstract class Doctor {
    abstract void SpacialistIn ();          // Abstract Method
}

class SpeBrain extends Doctor {
    @Override
    void SpacialistIn() {
        System.out.println("I am MBBS doctor and Special list of Brain Tumor");
    }
}

class SpeInHeart extends Doctor {

    @Override
    void SpacialistIn() {
        System.out.println("I am special list of Brain ");
    }
}

class SpeInEmergency extends Doctor {

    @Override
    void SpacialistIn() {
        System.out.println("I am doctor of emergency cases  ");
    }
}
 */
/*
Q3. why we cannot use multiple inheritance in java
Ans: java does not support multiple inheritance because it can makes the program conplex
so Questoin is java support multiple inheritance in java so its answer is "no"
 */

public class Abstract_Classes_and_Interfaces {
    public static void main(String[] args) {

/*
Q1. When to use abstract class in java
Ans : when we have to share same code , data , methods to other classes like
        Doctor doctor = new Doctor();
        doctor.eat();
        Engineer e = new Engineer();
        e.eat();
        labour l = new labour();
        l.eat();
 */



    }
}

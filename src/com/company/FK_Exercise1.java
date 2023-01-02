package com.company;
// First case
/*
abstract class Father{
    public void run(){
        System.out.println("I am rum method (F)");
    }
}

abstract class Mother{
    public void run(){
        System.out.println("I am run method (M)");
    }
}

class Child extends Father, Mother {      ---> Multithreading does not exist in java
  public void Check(){
      run();
  }
}

 */


/*
// 2nd case
interface Father {
    void Run();
    void Field();

}
interface Mother {
    void Run();
    void Field();
}

class Child implements Father, Mother {
    @Override
    public void Run() {
        System.out.println("I am Run method and i will be override in both Mother and Father Interface ");
    }

    public void Field (){
        System.out.println(" I am field method of Parent class  ");

    }
}
 */


abstract class Human {
    public void Eat(){
        System.out.println("Human Eating");
    }

 //    abstract public void Eat();

    public void Sleep(){
        System.out.println("Sleeping");
    }

}

class Father extends Human {

    public void Eat(int Father){
        System.out.println("(Father) Eating");
    }

}

class Mother extends  Father{
    public void Eat(String Mother){
        System.out.println("(Mother) Eating ");
    }

}

class Child extends Mother {
    Child(){
        System.out.println("I am child default constructor");
    }

    public void Sleep(){
        System.out.println("I am child and i want to sleep some more ");
    }
}

public class FK_Exercise1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Eat();
        c.Eat("Name");
        c.Eat(2);
        c.Sleep();


        /*
        // 1st and 2nd Case

        Father f = new Child();
        System.out.println("Father reference and child object ");
        f.run();

        System.out.println();
        Mother m = new Child();
        System.out.println("Mother reference and child object ");
        m.run();

        System.out.println();
        System.out.println("Child reference and child object ");
        Child c = new Child();
        c.
        run();
         */



        /*
        // 2nd case

        Mother m = new Child();
        System.out.println("Mother interface Method ");
        m.Run();
        m.Field();
        System.out.println();


        Father f = new Child();
        System.out.println("Father interface Method ");
        f.Run();
        f.Field();
        System.out.println();


        Child c = new Child();
        c.Run();
        c.Field();
        System.out.println();

        // OutPut ---> All the objects Reference and method has same out put
        // Thus if we have two different interfaces with the same method and if we implement new class from them
        // we have to override only one method and have to run only one method from them
         */




    }
}

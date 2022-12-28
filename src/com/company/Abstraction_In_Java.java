package com.company;

abstract class Plot {
    abstract void usePlot();
    abstract void usePlot(String Use);

}

class UsePlot extends Plot{
    public void usePlot(){
        System.out.println("I am using this plot for making house House");
    }

    public void usePlot(String Use){
        System.out.println("The plot is used for " + Use);

    }
}


public class Abstraction_In_Java {
    public static void main(String[] args) {
        UsePlot h = new UsePlot();
        h.usePlot();
        h.usePlot("Shop");
    }
}

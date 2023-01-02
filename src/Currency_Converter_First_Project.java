import java.util.Scanner;

public class Currency_Converter_First_Project {

    public static void main(String[] args) {
        System.out.println("1.Rupees \t 2.Dollar \t 3.Euro");
        System.out.println("4.Riyal \t 5.Dihram ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of currency you want to convert");
        int ChooseNumber = sc.nextInt();

        System.out.println("Enter the amount ");
        double amount = sc.nextDouble();

        switch (ChooseNumber){
            case 1 :{
                Rupee_To_Other(amount);
                break;
            }
            case 2 : {
                Dollar_To_Other(amount);
                break;
            }
            case 3 : {
               Euro_To_Other(amount);
            }
            case 4 : {
                Riyal_To_Other(amount);
            }


        }

    }

    public static void Rupee_To_Other(double amount){

        System.out.println("1 Rupee = 0.004 Dollar");
        System.out.println(amount + "Rupee = " + amount*0.004 + " Dollar");
        System.out.println();

        System.out.println("1 Rupee = 0.0041 Euro");
        System.out.println(amount + "Rupee = " + amount*0.0041 + " Euro");
        System.out.println();

        System.out.println("1 Rupee = 0.017 Riyal");
        System.out.println(amount + "Rupee = " + amount*0.017 + " Riyal");
        System.out.println();

        System.out.println("1 Rupee = 0.016");
        System.out.println(amount + "Rupee = " + amount*0.016 + " Dihram");
        System.out.println();

    }

    public static void Dollar_To_Other(double amount){

        System.out.println("1 Dollar = 226.16 Rupees");
        System.out.println(amount + "Dollar = " + amount*226.16 + " Rupees");
        System.out.println();

        System.out.println("1 Dollar = 0.93 Euro");
        System.out.println(amount + "Dollar = " + amount*0.93 + " Euros");
        System.out.println();

        System.out.println("1 Dollar = 3.16 Riyal");
        System.out.println(amount + "Dollar = " + amount*3.16 + " Riyals");
        System.out.println();

        System.out.println("1 Dollar = 3.67 Dihram");
        System.out.println(amount + "Dollar = " + amount*3.67 + " Dihram");
        System.out.println();
    }
    public static void Riyal_To_Other(double amount){
        System.out.println("1 Riyal  = 60.14 Rupee");
        System.out.println(amount + "Riyal = " + amount*60.14 + " Rupees");
        System.out.println();

        System.out.println("1 Riyal = 0.25 Euro");
        System.out.println(amount + "Riyal = " + amount*0.25 + " Euros");
        System.out.println();

        System.out.println("1 Riyal = 0.27 Dollar");
        System.out.println(amount + "Riyal = " + amount*0.27 + " Riyals");
        System.out.println();

        System.out.println("1 Riyal = 0.98 Dihram");
        System.out.println(amount + "Riyal = " + amount*0.98 + " Dihram");
        System.out.println();
    }


    public static void Euro_To_Other(double amount){
        System.out.println("1 Euro  = 242.01 Rupees");
        System.out.println(amount + "Euro = " + amount*242.01 + " Rupees");
        System.out.println();

        System.out.println("1 Euro = 4.01 Riyal");
        System.out.println(amount + "Euro = " + amount*4.01 + " Riyals");
        System.out.println();

        System.out.println("1 Euro = 1.07 Dollar");
        System.out.println(amount + " Euro = " + amount*1.07 + " Dollars");
        System.out.println();

        System.out.println("1 Euro = 3.92 Dihram");
        System.out.println(amount + "Riyal = " + amount*3.92 + " Dihram");
        System.out.println();
    }


}


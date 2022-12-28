package com.company;

// There are some four steps to handle a file // Java file operation methods
// 1. Create a new java file
// 2. Write java file
// 3. Read java file
// 4. Delete java file

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling_In_java {
    public static void main(String[] args) {
        /*
        // code to create a file
        File myFile = new File("Fardeel57.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e) {
            System.out.println("some error occur");
            throw new RuntimeException(e);
        }


        // code to write a file
        try {
            FileWriter fileWriter = new FileWriter("Fardeel57.txt");
            fileWriter.write("Hi here i am trying to write my first file in java \n by Fardeel Azhar ");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */

        // Code to read a file
//        File myFile = new File("Fardeel57.txt");
//
//        try {
//            Scanner sc = new Scanner(myFile);
//            System.out.println(sc.nextLine());
//            sc.close();
//        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // code to delete a file
        File myFile = new File("Fardeel57.txt");
        if (myFile.delete()){
            System.out.println("i have deleted the file " + myFile);
        }
        else {
            System.out.println("Some error occur");
        }

    }
}

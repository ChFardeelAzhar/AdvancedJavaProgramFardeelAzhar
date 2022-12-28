package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling_Practice {
    public static void main(String[] args) {

        // Creating File of Friends
        File First = new File("Alyan.txt");
        try {
            First.createNewFile();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        File Sec = new File("Ahmed.txt");
        try {
            Sec.createNewFile();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        File Third = new File("Saim.txt");
        try {
            Third.createNewFile();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        File Forth = new File("Faiq.txt");
        try {
            Forth.createNewFile();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Writing files

        try {
            FileWriter alyan = new FileWriter("Alyan.txt");
            alyan.write("Hi Fardeel i am alyan one of your friends \n we are old friends ");
            alyan.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileWriter saim = new FileWriter("Saim.txt");
            saim.write("Hi Fardeel i am saim one of your friends \n we are old friends ");
            saim.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileWriter ahmed = new FileWriter("Ahmed.txt");
            ahmed.write("Hi Fardeel i am ahmed one of your friends \n we are old friends ");
            ahmed.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileWriter faiq = new FileWriter("Faiq.txt");
            faiq.write("Hi Fardeel i am faiq one of your friends \n we are new friends ");
            faiq.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Reading Friends file's
        // we have to use scanner class if we want to read any file like : Scanner sc = new Scanner (file name);

        try {
            Scanner sc = new Scanner(First);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            Scanner sc = new Scanner(Sec);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            Scanner sc = new Scanner(Third);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            Scanner sc = new Scanner(Forth);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        // Deleting a file
        File First1 = new File("First1.txt");
        try {
            First1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        First1.delete();
        First.delete();
        Sec.delete();
        Third.delete();


    }
}

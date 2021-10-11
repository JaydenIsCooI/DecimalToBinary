package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Binary Converter" + "\n-------------------------");

        System.out.print("Enter Number to be Converted :: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        System.out.println("-------------------------" + "\nN = " + N);
        int R1 = N % 2;
        System.out.println("N mod 2 = " + R1 + " (Ones Place)");
        N /= 2;
        System.out.println("N div 2 = " + N);

        System.out.println("-------------------------" + "\nN = " + N);
        int R2 = N % 2;
        System.out.println("N mod 2 = " + R2 + " (Twos Place)");
        N /= 2;
        System.out.println("N div 2 = " + N);

        System.out.println("-------------------------" + "\nN = " + N);
        int R3 = N % 2;
        System.out.println("N mod 2 = " + R3 + " (Fours Place)");
        N /= 2;
        System.out.println("N div 2 = " + N);

        System.out.println("-------------------------" + "\nN = " + N);
        int R4 = N % 2;
        System.out.println("N mod 2 = " + R4 + " (Eights Place)");
        N /= 2;
        System.out.println("N div 2 = " + N);

        System.out.println("-------------------------" + "\nN = " + N);
        int R5 = N % 2;
        System.out.println("N mod 2 = " + R5 + " (Sixteenths Place)");
        N /= 2;
        System.out.println("N div 2 = " + N);

        System.out.println("-------------------------" + "\nN = " + N);
        int R6 = N % 2;
        System.out.println("N mod 2 = " + R6 + " (32nd Place)");
        N /= 2;
        System.out.println("N div 2 = " + N);

        String a = String.valueOf(R6);
        String b = String.valueOf(R5);
        String c = String.valueOf(R4);
        String d = String.valueOf(R3);
        String e = String.valueOf(R2);
        String f = String.valueOf(R1);

        System.out.println("-------------------------");
        System.out.println("Number in Binary :: " + a+b+c+d+e+f);
        System.out.println("-------------------------");

    }
}

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String num1, num2;
        int n1, n2;
        int result;
        System.out.print("What is the first number? ");
        num1=sc.nextLine();
        System.out.print("What is the second number? ");
        num2=sc.nextLine();
        n1=Integer.parseInt(num1);
        n2=Integer.parseInt(num2);
        result=n1+n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        result=n1-n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        result=n1*n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        result=n1/n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
    }
}

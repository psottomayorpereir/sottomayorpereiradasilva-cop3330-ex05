/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String num1, num2;
        double n1=0.0, n2=0.0;
        boolean check=true;
        double add, sub, mul, div;
        do{
            System.out.print("What is the first number? ");
            num1=sc.nextLine();
            try{
                n1 = Double.parseDouble(num1);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
            if(n1<0){
                System.out.println("Do not enter a negative number!");
            }
        }while(n1<0 || check==false);
        do{
            System.out.print("What is the second number? ");
            num2=sc.nextLine();
            try{
                n2 = Double.parseDouble(num2);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
            if(n2<=0){
                System.out.println("Do not enter a negative number nor zero for the second number!");
            }
        }while(n2<=0 || check==false);
        add=n1+n2;
        sub=n1-n2;
        mul=n1*n2;
        div=n1/n2;
        System.out.printf("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.2f\n%.2f / %.2f = %.2f\n", n1,n2,add,n1,n2,sub,n1,n2,mul,n1,n2,div);
    }
}

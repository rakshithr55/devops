package com.example.slk.Devops;

import com.example.slk.Devops.Add;
import com.example.slk.Devops.Divide;
import com.example.slk.Devops.Multiply;
import com.example.slk.Devops.Subtract;

/**
 * Simple calculator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This is a simple calculator project\n" );
        Add add = new Add();
        Subtract sub = new Subtract();
        Multiply mul = new Multiply();
        Divide div = new Divide();
        
        int num1 = 150, num2 = 10;
        System.out.println("The operations performed on num1 and num2 is:\n");
        System.out.println("Add: " + add.add(num1, num2));
        System.out.println("Subtract: " + sub.subtract(num1, num2));
        System.out.println("Multiply: " + mul.multiply(num1, num2));
        System.out.println("Divide: " + div.divide(num1, num2));
    }
}
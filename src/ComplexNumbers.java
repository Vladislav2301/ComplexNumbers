// Program to add/subtract complex numbers

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComplexNumbers {

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c, d;

        System.out.println("Please, enter first number a+bi:");
        System.out.println("Please, enter value for a:");
        a = Integer.parseInt(in.readLine());
        System.out.println("Please, enter value for b:");
        b = Integer.parseInt(in.readLine());

        System.out.println("Please, enter second number c+di:");
        System.out.println("Please, enter value for c:");
        c = Integer.parseInt(in.readLine());
        System.out.println("Please, enter value for d:");
        d = Integer.parseInt(in.readLine());

        System.out.println("\n"+"Result of addition:");
        System.out.print(a+c);
        System.out.print((b+d)>0?"+":"");
        System.out.print(b+d + "i ");

        System.out.println("\n"+"Result of subtraction:");
        System.out.print(a-c);
        System.out.print((b+d)>0?"+":"");
        System.out.print(b-d + "i ");

    }
}

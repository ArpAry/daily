import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n= scanner.nextInt();
       int a=n%2;
       if(a==1)
       {
           System.out.println("Weird");
       }
       else
       {
           if(n<5)
           {
               System.out.println("Not Weird");
           }
           else if(n>5&&n<21)
           {
               System.out.println("Weird");
           }
           else if(n>20)
           {
               System.out.println("Not Weird");
           }
       }
       
    }
}

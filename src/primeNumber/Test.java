package primeNumber;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        checkNumberIsPrime ck=new checkNumberIsPrime();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();sc.close();
    boolean p=ck.isPrime(n);
    System.out.println("number is prime = "+p);
        
    }
    
    
    
}

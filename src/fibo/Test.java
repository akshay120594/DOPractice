package fibo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FibonacciSequence fibo = new FibonacciSequence();       
        int n;
        System.out.println("enter sequence length");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();sc.close();
        fibo.makeFibonacci(n);
        FiboRecursion fr = new FiboRecursion();
        System.out.println("by recursion function");
        for(int i=0;i<=n;i++){
            System.out.print(fr.Fibo(i)+", ");
        }     

        
    }
    
}

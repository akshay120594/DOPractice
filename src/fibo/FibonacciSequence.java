package fibo;

public class FibonacciSequence {
    int a=0,b=1,c=1,n;
    public void makeFibonacci(int n){
        for(int i=0;i<=n;i++){
            System.out.print(a+", ");
           // System.out.print(b+" ");
            a=b;
            b=c;
            c=a+b;

        }

    }
    
}

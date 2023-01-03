package fibo;

public class FiboRecursion {
    int n;
    public int Fibo(int n){
        if(n<=1)
            return n;
        else
            return Fibo(n-1)+Fibo(n-2);  
    }
    
}

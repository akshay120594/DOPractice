package primeNumber;

public class checkNumberIsPrime {
    int n;
    boolean p;
    public boolean isPrime(int n){
        if(n==0||n==1)
            return false;
        if(n==2)
           return true;
        else{
            for(int i=2;i<=n/2;i++){
                if(n%2==0)
                    return false;
            }
        }
        return true;
    }
    
    

    
    
    
    
}

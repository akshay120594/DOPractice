package swap;

public class SwapWithoutThird {
    int a;
    int b;
    
    public SwapWithoutThird(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap(){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }


    
}

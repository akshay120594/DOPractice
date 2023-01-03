package vowelPresent;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        VowelCheck vc=new VowelCheck();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        sc.close();
        System.out.println("String contains"+vc.checkVowelsInString(s)); 

    }
    
}

package vowelPresent;



public class VowelCheck {
    String s;
    
    public boolean checkVowelsInString(String s){
        this.s=s;
        return s.toLowerCase().matches(".*[aeiou].*");

    }


    
}

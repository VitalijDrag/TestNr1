class GFG {
    public static void main (String[] args) {

        String str= "Ignas", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Ignas");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed wrod: "+ nstr);
    }
}


public class ReverseStringNr1 {
}

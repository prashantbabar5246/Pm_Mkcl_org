package page.Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class Demo_Class {
    /*
    public static void main(String[] args) {
        String original,reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("enter string value");
        original= in.next();
        int length = original.length();
        for(int i = length - 1; i>=0; i-- ){
            reverse= reverse + original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
    
     */

    public interface inter{
        public abstract void DemoInter();
    }

    public interface sumInter{
        public abstract int sum(int a, int b);
    }

    public interface Length{
        public abstract  int getLength(String str);

    }


    public static void main(String[] args) {
        List Categories = Arrays.asList("Prashant","Aniket","Pratik","Shubham","Kiran");
        for (Object Category:Categories){
            System.out.println(Category);             // This is a for each loop
        }

        Categories.stream().forEach(CG-> System.out.println(CG));
        String Phrase = "Hello World";
        String AB = Phrase.substring(0, 2);
        String CD =  AB.toLowerCase(Locale.ROOT);
        String EF = Phrase.substring(2);

        System.out.println(EF + CD);

        List <String>  list = Arrays.asList("Prashant","ANiket");

        list.stream().forEach(name-> System.out.println("This is name: "+ name));
        String Name= "Geeks", EmptyString="";
        char ab;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<Name.length(); i++)
        {
            ab= Name.charAt(i); //extracts each character
            EmptyString= ab + EmptyString; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ EmptyString);

}
    }





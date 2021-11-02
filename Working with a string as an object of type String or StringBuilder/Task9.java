//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
//Учитывать только английские буквы. 

package task9;

import java.util.Scanner;
import java.util.ArrayList;

public class Task9 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        ArrayList<Character.UnicodeBlock> english = new ArrayList<>();
        english.add(Character.UnicodeBlock.BASIC_LATIN);
        english.add(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
        english.add(Character.UnicodeBlock.LATIN_EXTENDED_A);
        english.add(Character.UnicodeBlock.GENERAL_PUNCTUATION);
               
        int lower = 0;
        int upper = 0;
        for ( char tmp: str.toCharArray() )
        {
            Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(tmp);
            if (english.contains(unicodeBlock)) 
            {
                if (Character.isUpperCase(tmp) && Character.isLetter(tmp))
                    upper++;
                if (Character.isLowerCase(tmp) && Character.isLetter(tmp))
                    lower++;
            }
        }
        
        System.out.println("Lower = " + lower);
        System.out.println("Upper = " + upper);
        
    }
    
}

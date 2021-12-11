/*
 * 9. 
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
 * Учитывать только английские буквы. 
 */

package by.epam.strings.strings_as_object;

import java.util.Scanner;
import java.util.ArrayList;

public class Task9 {

    public static void main(String[] args) {

        String str = input();
                      
        int lower = countLower(str);      
        int upper = countUpper(str);
               
        output("Lower = ", lower);
        output("Upper = ", upper);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }
    
    private static ArrayList<Character.UnicodeBlock> addCharacterUnicodeBlock() {
        
        ArrayList<Character.UnicodeBlock> english = new ArrayList<>();
        english.add(Character.UnicodeBlock.BASIC_LATIN);
        english.add(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
        english.add(Character.UnicodeBlock.LATIN_EXTENDED_A);
        english.add(Character.UnicodeBlock.GENERAL_PUNCTUATION);
        
        return english;
        
    }
    
    private static int countLower(String str) {
        
        int lower = 0;
        ArrayList<Character.UnicodeBlock> english = addCharacterUnicodeBlock();
        
        for (char tmp: str.toCharArray()) {
            Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(tmp);
            if (english.contains(unicodeBlock)) 
                if (Character.isLowerCase(tmp) && Character.isLetter(tmp))
                    lower++;
        }
        
        return lower;
        
    }
    
    private static int countUpper(String str) {
        
        int upper = 0;
        ArrayList<Character.UnicodeBlock> english = addCharacterUnicodeBlock();
        
        for (char tmp: str.toCharArray()) {
            Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(tmp);
            if (english.contains(unicodeBlock)) 
                if (Character.isUpperCase(tmp) && Character.isLetter(tmp))
                    upper++;
        }
        
        return upper;
        
    }
    
    private static void output(String str, int count) {
        
        System.out.println(str + count);
        
    }
    
}

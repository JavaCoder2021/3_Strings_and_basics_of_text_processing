/*
 * 6. 
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        String str = input();
        
        String newStr = doubledCharacters(str);
        
        output(newStr);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }    
    
    private static String doubledCharacters(String str) {

        StringBuilder builder = new StringBuilder();
        
        for (char c: str.toCharArray()) 
            builder.append(c).append(c);
                        
        return builder.toString();
       
   }
    
    private static void output(String str) {
        
        System.out.println("New line = " + str);
        
    }
    
}

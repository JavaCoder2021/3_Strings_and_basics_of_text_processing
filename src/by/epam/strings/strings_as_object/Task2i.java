/*
 * 2. 
 * В строке вставить после каждого символа 'a' символ 'b'. 
 */

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task2i {

    public static void main(String[] args) {

        String str = input();
        
        String newStr = replaceString(str);
        
        output(newStr);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }       
    
    private static String replaceString(String str) {

        StringBuilder builder = new StringBuilder();
        
        for (char c: str.toCharArray()) {
            if (c == 'а' || c == 'a') //Russian and English 'a' 
                builder.append("ab");
            else 
                builder.append(c);
        }
                          
        return builder.toString();
       
   }
    
    private static void output(String str) {
        
        System.out.println("New line = " + str);
        
    }    
    
}

/*
2. В строке вставить после каждого символа 'a' символ 'b'.
*/

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task2i {

    public static void main(String[] args) {

        String str = input();
        
        String newString = replaceString(str);
        
        output(newString);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }       
    
    private static String replaceString(String str) {

        StringBuilder builder = new StringBuilder();
        
        for (char c: str.toCharArray()) 
        {
            if (c == 'а' || c == 'a') //Russian and English 'a' 
                    builder.append("ab");
            else 
                builder.append(c);
        }
        
        str = builder.toString();
                          
        return str;
       
   }
    
    private static void output(String str) {
        
        System.out.println("New line = " + str);
        
    }    
    
}

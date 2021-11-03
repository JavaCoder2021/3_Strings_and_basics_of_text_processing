/*
7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/

package by.epam.strings.strings_as_object;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class Task7 {

    public static void main(String[] args) {

        String str = input();
        
        str = removeDuplicateCharacters(str);
               
        output(str);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }
    
    private static String removeDuplicateCharacters(String str) {
        
        LinkedHashSet<Character> temp = new LinkedHashSet<>();
        StringBuilder builder = new StringBuilder();
 
        str = str.replace(" ", "");
 
        for (int i = 0; i < str.length(); i++) 
            if (temp.add(str.charAt(i)))
            {
                builder.append(str.charAt(i));
            }
        
        return builder.toString();
        
    }
    
    private static void output(String str) {
        
        System.out.println("New line = " + str);
        
    }

}

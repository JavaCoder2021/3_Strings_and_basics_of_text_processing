// 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
//Например, если было введено "abc cde def", то должно быть выведено "abcdef". 

package task7;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class Task7 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine(); 
        
        LinkedHashSet<Character> temp = new LinkedHashSet<>();
        StringBuilder builder = new StringBuilder();
 
        str = str.replace(" ", "");
 
        for (int i = 0; i < str.length(); i++) 
            if (temp.add(str.charAt(i)))
            {
                builder.append(str.charAt(i));
            }    
        
        String newString = builder.toString(); 
        System.out.println("New line = " + newString);
        
    }

}

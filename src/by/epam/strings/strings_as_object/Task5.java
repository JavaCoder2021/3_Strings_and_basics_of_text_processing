/*
 * 5. 
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”. 
 */

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        String str = input();
        
        int count = characters(str);
        
        output(count);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }    
    
    private static int characters(String str) {

        int count = 0;
        
        for (char c: str.toCharArray()) 
            if (c == 'а' || c == 'a') //Russian and English 'a'
                count++;
                        
        return count;
       
   }
    
    private static void output(int count) {
        
        System.out.println("count = " + count);
        
    }
    
}

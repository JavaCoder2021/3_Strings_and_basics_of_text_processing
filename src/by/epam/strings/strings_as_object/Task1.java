/*
 * 1. 
 * Дан текст (строка). 
 * Найдите наибольшее количество подряд идущих пробелов в нем.
 */

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        String str = input();
        
        int max = getSpaceCount(str);

        output(max);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    } 
    
    private static int getSpaceCount(String s) {
        
        int max = 0;
        int count = 0;
        int a;
        char[] str = s.toCharArray();
        
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                count = 1;
                for (a = 1; ((a + i) < str.length && (str[a + i] == ' ')); a++)
                    count++;
            }
            if (count > max) max = count;
        }
        
        return max;
        
    }
    
    private static void output(int count) {
        
        System.out.println("Max number of spaces = " + count);
        
    }
    
}

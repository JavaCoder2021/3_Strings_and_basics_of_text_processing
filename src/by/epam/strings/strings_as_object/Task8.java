/*
 * 8. 
 * Вводится строка слов, разделенных пробелами. 
 * Найти самое длинное слово и вывести его на экран. 
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        
        String str = input();
               
        String[] words = str.split(" ");

        int wordNumber = getLongWord(words);
        
        output(words[wordNumber]);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }
    
    private static int getLongWord(String[] words) {
        
        int max = 0;
        int wordNumber = 0;
        
        for (int i = 0; i < words.length; i++)   
            if (words[i].length() > max) {
                max = words[i].length();
                wordNumber = i;
            }
        
        return wordNumber;
        
    }
    
    private static void output(String str) {
        
        System.out.println("Longest word = " + str);
        
    }
    
}

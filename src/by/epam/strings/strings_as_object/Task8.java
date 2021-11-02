/*
8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        
        String str = input();
        
        str = str.trim();
        String[] words = str.split(" ");

        int wordNumber = getLongWord(str, words);
        
        output(words[wordNumber]);
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }
    
    private static int getLongWord(String str, String[] words) {
        
        int max = 0;
        int count;
        int wordNumber = 0;
        for (int i = 0; i < words.length; i++)
        {
            count = 0;
            char[] tmp = words[i].toCharArray();
            for (int a = 0; a < tmp.length; a++)
            {
                count++;
            }         
            if (count > max)
            {
                max = count;
                wordNumber = i;
            }
        }
        
        return wordNumber;
        
    }
    
    private static void output(String str) {
        
        System.out.println("Longest word = " + str);
        
    }
    
}

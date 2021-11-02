// 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
//Случай, когда самых длинных слов может быть несколько, не обрабатывать. 

package task8;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();

        str = str.trim();
        String[] words = str.split(" ");
        
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
        
        System.out.println("Longest word = " + words[wordNumber]);
        
    }
    
}

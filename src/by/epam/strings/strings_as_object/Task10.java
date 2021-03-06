/*
 * 10. 
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X. 
 */

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        String str = input();
      
        output(countOfSentences(str));
        
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
        
        return str;
        
    }
    
    private static boolean isEndOfnumberSentence(char tmp) {
        
        boolean isEnd = false;

        if (tmp == '.' || tmp == '!' || tmp == '?') 
            isEnd = true;

        return isEnd;
        
    }
    
    private static int countOfSentences(String str) {

        int numberSentences = 0;
        
        for (char tmp : str.toCharArray()) {
            if (isEndOfnumberSentence(tmp))   
                numberSentences++;            
        }
        
        return numberSentences;
         
    }
    
    private static void output(int numberSentences) {
        
        System.out.println("Number of sentences = " + numberSentences);
        
    }
    
}

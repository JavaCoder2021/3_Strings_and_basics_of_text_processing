/*
1.  Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  
позволяющее  выполнять  с  текстом  три  различных операции:  
 - отсортировать  абзацы  по  количеству  предложений;  
 - в  каждом  предложении  отсортировать  слова  по  длине; 
 - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, 
        а в случае равенства  – по алфавиту. 
*/

package by.epam.strings.regular_expressions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1 {
    
    public static void main(String[] args) {

        String text =
                "Bas drive dd a? Car a bb cccc! Lokomotiv to goy.\n" +
                "Bas drive d? Car: a bb cccc.\n" +
                "Bas drive vv a tt.\n";
                
        ui(text);
        
    }
    
    private static void ui(String text) {
     
        int choose = input();

        switch (choose)
        {
            case 1:
                System.out.println("\n" + text);
                break;           
            case 2:
                System.out.println("\n" + sortParagraphsBySentencesCount(text));
                break;           
            case 3:
                System.out.println("\n" + sortWordByLength(text));
                break;      
            case 4:
                System.out.println("\n" + sortLexems(text));
                break;  
            default:
                System.out.println("\n" + "Incorrect choose!" + "\n");
                break;         
        }
        
        ui(text);
        
    }
    
    private static int input() {
        
        Scanner input = new Scanner(System.in);
        menuText();    
        while (!input.hasNextInt()) 
        {
            input.next();
            menuText();
        }
        int choose = input.nextInt();        
        
        return choose;
        
    }
    
    private static void menuText() {
        
        System.out.print(
                "Menu:\n" +
                "1. Show text\n" +
                "2. Sort paragraphs by sentences's count.\n" +
                "3. Sort words in sentences by length.\n" +
                "4. Sort lexems by count of symbol.\n\n" +
                "Please select the action: ");
        
    }
    
    private static String[] splitParagraphs(String text) {
               
        return text.split("\n");
        
    }
           
    private static String[] splitSentences(String paragraph) {
        
        Pattern pattern = Pattern.compile("\\.*[!?.]\\s*");
        
        return pattern.split(paragraph);
        
    }
    
    private static String[] splitWords(String sentence) {
        
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
               
        return pattern.split(sentence);
        
    }
    
    private static String sortParagraphsBySentencesCount(String text) {
        
        String[] paragraphs;
        int i, a;
        int min, count;
        String tmp;
        
        paragraphs = splitParagraphs(text);
      
        for (i = 0; i < paragraphs.length - 1; i++)
        {
            count = i;
            min = splitSentences(paragraphs[i]).length;
            for (a = i + 1; a < paragraphs.length; a++)
            {        
                if (splitSentences(paragraphs[a]).length < min)
                {
                    count = a;
                    min = splitSentences(paragraphs[a]).length;
                }
            }
            tmp = paragraphs[i];
            paragraphs[i] = paragraphs[count];
	    paragraphs[count] = tmp;            
        }
        
        StringBuilder str = new StringBuilder();
        for (String paragraph : paragraphs) 
            str.append(paragraph).append("\n");
        
        return str.toString();
        
    }
    
    private static String sortWordByLength(String text) {
        
        String[] paragraphs;
        String[] sentences;
        String[] words;
        int i, a, q, z;
        int min;
        int count;
        String tmp;
        StringBuilder str = new StringBuilder();
        
        paragraphs = splitParagraphs(text);
        for (i = 0; i < paragraphs.length; i++)
        {
            sentences = splitSentences(paragraphs[i]);
            for (a = 0; a < sentences.length; a++)
            {
                words = splitWords(sentences[a]);
                for (q = 0; q < words.length - 1; q++)
                {
                    count = q;
                    min = words[q].length();
                    for (z = q + 1; z < words.length; z++)
                    {       
                        if (words[z].length() < words[count].length())
                        {
                            count = z;
                            min = words[z].length();
                        }
                    }
                        tmp = words[q];
                        words[q] = words[count];
                        words[count] = tmp; 
                    if (q == 0) 
                        str.append(words[q].substring(0, 1).toUpperCase() + words[q].substring(1)).append(" ");
                    else
                        str.append(words[q].toLowerCase()).append(" ");
                }
                str.append(words[q]).append(". ");
            }
            str.append("\n");
        }  
       
        return str.toString();
        
    }
    
    private static String sortLexems(String text) {
        
        StringBuilder tempString;
        String[] paragraphs;
        String[] sentences;
        String[] words;
        char sign;
        boolean sorted;
        String substr;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter symbol or string: ");

        while (!in.hasNextLine()) {
            in.next();
            System.out.print("Enter symbol or string: ");
        }
        substr = in.nextLine();

        paragraphs = splitParagraphs(text);

        for (int i = 0; i < paragraphs.length; i++) {

            sentences = splitSentences(paragraphs[i]);

            for (int j = 0; j < sentences.length; j++) {

                tempString = new StringBuilder(sentences[j]);
                sign = tempString.charAt(tempString.length() - 1);
                tempString.deleteCharAt(tempString.length() - 1);
                sentences[j] = tempString.toString().toLowerCase(Locale.ROOT);

                words = splitWords(sentences[j]);

                words = sortLexemsBySubstringsCount(words, substr);
                Arrays.sort(words);
                words = sortLexemsBySubstringsCount(words, substr);

                tempString = new StringBuilder();
                for (int k = 0; k < words.length; k++) {
                    tempString.append(words[k]).append(" ");
                }
                tempString.deleteCharAt(tempString.length() - 1);
                tempString.append(sign);

                sentences[j] = tempString.toString().toLowerCase(Locale.ROOT);
                sentences[j] = Character.toUpperCase(sentences[j].charAt(0)) + sentences[j].substring(1);

            }

            tempString = new StringBuilder();
            for (int j = 0; j < sentences.length; j++) {
                tempString.append(sentences[j]).append(". ");
            }
            tempString.deleteCharAt(tempString.length() - 1);
            paragraphs[i] = tempString.toString();
        }

        tempString = new StringBuilder();
        for (int i = 0; i < paragraphs.length; i++) {
            tempString.append(paragraphs[i]).append("\n");
        }
        tempString.deleteCharAt(tempString.length() - 1);
        
        text = tempString.append("\n").toString();

        return text;
        
    }

    private static String[] sortLexemsBySubstringsCount(String[] lexems, String substr) {
        
        boolean sorted;
        String tempString;
        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lexems.length - 1; i++) {
                if (countingSubstring(lexems[i], substr) < countingSubstring(lexems[i + 1], substr)) {
                    tempString = lexems[i];
                    lexems[i] = lexems[i + 1];
                    lexems[i + 1] = tempString;
                    sorted = false;
                }
            }
        }
        
        return lexems;
        
    }
    
    // searching substrings in words and returning count of matches
    private static int countingSubstring(String word, String substr) {
        
        int count;

        count = 0;

        Pattern pattern = Pattern.compile(substr);
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            count++;
        }

        return count;

    }
    
}

//2. Замените в строке все вхождения 'word' на 'letter'. 

package task2;

public class Task2 {

    public static void main(String[] args) {
        
        String oldStr = "word and word and word!";
        System.out.println(oldStr);
        
        String newStr = oldStr.replace("word", "letter");
        System.out.println(newStr);
        
    }
    
}

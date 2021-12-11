/*
 * 3. 
 * В строке найти количество цифр. 
 */

package by.epam.strings.strings_as_chars_array;

public class Task3 {

    public static void main(String[] args) {
        
        String str = "I have 22 bananas, 121 pencils, and 32 apples";
        System.out.println(str);
        
        int count = numberOfDigits(str);
        
        System.out.println("Number of digits: " + count);
            
    }
    
    public static int numberOfDigits(String str) {
        
        char[] tmp = str.toCharArray();
        int count = 0;
        
        for (int i = 0; i < tmp.length; i++)
            if (Character.isDigit(tmp[i]))
                count++;
        
        return count;
        
    }
    
}

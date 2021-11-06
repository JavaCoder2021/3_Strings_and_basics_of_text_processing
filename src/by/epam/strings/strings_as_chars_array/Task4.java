/*
4. В строке найти количество чисел.
*/

package by.epam.strings.strings_as_chars_array;

public class Task4 {

    public static void main(String[] args) {
        
        String str = "I have 22 bananas, 121 pencils, and 32 apples";
        System.out.println(str);
        
        String[] sarr = str.split(" ");
        int count = 0;
        for(String str1 : sarr) {
            try {
                Integer.parseInt(str1);
            } catch(NumberFormatException e) {
                count++;
            }
        }     
        System.out.println("Amount of numbers: " + (sarr.length - count));
            
    }
    
}

/*
 * 2. 
 * В строке вставить после каждого символа 'a' символ 'b'. 
 */

package by.epam.strings.strings_as_object;

public class Task2 {

    public static void main(String[] args) {

        String s = "I have 22 bananas, 121 pencils, and 32 apples";
        System.out.println("Line = " + s);
        
        String newStr = replaceString(s);
        
        output(newStr);
        
    }
    
    private static String replaceString(String s) {
        
        char[] str = s.toCharArray();
        String newStr = "";
        
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a' || str[i] == 'а') //Russian and English 'a'
                newStr += "ab";
            else 
                newStr += str[i];   
        }

        return newStr;
        
    }
    
    private static void output(String str) {
        
        System.out.println("New line = " + str);
        
    }  
    
}

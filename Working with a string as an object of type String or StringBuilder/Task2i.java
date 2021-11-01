//2. В строке вставить после каждого символа 'a' символ 'b'.  

package task2i;

import java.util.Scanner;

public class Task2i {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Line = ");
        String str = input.nextLine(); 
        
        String newString = replaceString(str);
        
        System.out.println("New line = " + newString);
        
    }
    
    public static String replaceString(String str) {

        StringBuilder builder = new StringBuilder();
        
        for (char c: str.toCharArray()) 
        {
            if (c == 'a') 
                    builder.append("ab");
            else 
                builder.append(c);
        }
        
        str = builder.toString();
                          
        return str;
       
   }
    
}

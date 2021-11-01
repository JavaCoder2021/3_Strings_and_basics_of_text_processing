//6. Из заданной строки получить новую, повторив каждый символ дважды.  

package task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Line = ");
        String str = input.nextLine(); 
        
        String newString = doubledCharacters(str); 
        System.out.println("New line = " + newString);
        
    }
    
   public static String doubledCharacters(String str) {

        StringBuilder builder = new StringBuilder();
        
        for (char c: str.toCharArray()) 
            builder.append(c).append(c);
        
        str = builder.toString();
                        
        return str;
       
   }
    
}

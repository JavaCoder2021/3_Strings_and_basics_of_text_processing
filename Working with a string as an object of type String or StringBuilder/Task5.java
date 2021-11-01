//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”. 

package task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Line = ");
        String str = input.nextLine(); 
        
        int count = characters(str);
        System.out.println("count = " + count);
        
    }
    
   public static int characters(String str) {

        int count = 0;
        
        for (char c: str.toCharArray()) 
            if (c == 'a') 
                count++;
                        
        return count;
       
   }
    
}

//3. Проверить, является ли заданное слово палиндромом. 

package task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Word = ");
        String str = input.nextLine(); 
       
        String newStr = new StringBuilder(str).reverse().toString();
        
        if (str.equals(newStr))
            System.out.println(str + " = palindrome");
        else 
            System.out.println(str + " not palindrome");
            
    }
        
}

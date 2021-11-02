/*
3. Проверить, является ли заданное слово палиндромом.
*/

package by.epam.strings.strings_as_object;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        
        String str = input();
       
        String newStr = new StringBuilder(str).reverse().toString();
        
        if (str.equals(newStr))
            System.out.println(str + " = palindrome");
        else 
            System.out.println(str + " not palindrome");
            
    }
    
    private static String input() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Word = ");
        String str = input.nextLine();
        
        return str;
        
    }    
        
}

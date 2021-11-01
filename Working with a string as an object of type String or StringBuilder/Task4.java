//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”. 

package task4;

public class Task4 {

    public static void main(String[] args) {

        String str = "информатика";
        
        String newStr = str.substring(7,8) + str.substring(3,5) + str.substring(7,8);
        
        System.out.println(newStr);
                
    }
    
}

//3+. В строке найти количество чисел. 

package task3i;

public class Task3i {

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

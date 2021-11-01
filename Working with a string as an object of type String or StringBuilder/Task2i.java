//2. В строке вставить после каждого символа 'a' символ 'b'.  

package task2i;

public class Task2i {

    public static void main(String[] args) {

        String s = "I have 22 bananas, 121 pencils, and 32 apples";
        System.out.println(s);
        
        StringBuilder str = replaceString(s);
        String newString = str.toString();
        
        System.out.println("New string = " + newString);
        
    }
    
   public static StringBuilder replaceString(String s) {

        StringBuilder str = new StringBuilder();
        
        for (char c: s.toCharArray()) 
        {
            if (c == 'a') 
                    str.append("ab");
            else 
                str.append(c);
        }
                          
        return str;
       
   }
    
}

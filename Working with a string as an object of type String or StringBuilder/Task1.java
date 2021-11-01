//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем. 

package task1;

public class Task1 {

    public static void main(String[] args) {

        String s = "I have 22 bananas, 121   pencils, and 32     apples";
        System.out.println(s);
        
        int max = getSpaceCount(s);

        System.out.println("max = " + max);
        
    }
    
    public static int getSpaceCount(String s) {
        
        int max = 0;
        int count = 0;
        int a;
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++)
        {
            if (str[i] == ' ')
            {
                count = 1;
                for (a = 1; ((a + i) < str.length && (str[a + i]==' ')); a++)
                    count++;
            }
            if (count > max) max = count;
        }
        
        return max;
        
    }
    
}

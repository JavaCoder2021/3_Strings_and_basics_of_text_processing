//5.  Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  
//заменить  на  одиночные  пробелы.
//Крайние пробелы в строке удалить. 

package task5;

public class Task5 {

    public static void main(String[] args) {
        
        String str = "   I   have   22     bananas,    121     pencils,    and     32     apples      ";
        System.out.println(str);
        
        final String twoSpaces="  ";
        final String oneSpace=" ";
        
        while(str.contains(twoSpaces)) 
        {
            str = str.replace(twoSpaces, oneSpace);
        }
        
        str = str.trim();
        System.out.println(str);
        
    }
    
}

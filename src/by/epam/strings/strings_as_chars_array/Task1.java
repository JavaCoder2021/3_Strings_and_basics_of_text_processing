/*
 * 1. 
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case. 
 */

package by.epam.strings.strings_as_chars_array;

public class Task1 {

    public static void main(String[] args) {

        String[] camelCase = {"getChars", "equalsIgnoreCase", "toLowerCase", 
                                    "toUpperCase", "toCharArray", "charAt"};
        
        String[] snakeCase = toSnakeCase(camelCase);
        
        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
        
    }
    
    public static String[] toSnakeCase(String[] camelCase) {
        
        String[] snakeCase = new String[camelCase.length];
             
        for (int i = 0; i < camelCase.length; i++) {
            char[] tmp = camelCase[i].toCharArray();
            snakeCase[i] = "";
            for (int a = 0; a < tmp.length; a++) {
                if (Character.isLowerCase(tmp[a]))
                    snakeCase[i] += tmp[a];
                if (Character.isUpperCase(tmp[a])) {
                    snakeCase[i] += "_";
                    snakeCase[i] += Character.toLowerCase(tmp[a]);
                }
            }
        }
        
        return snakeCase;
        
    }

}

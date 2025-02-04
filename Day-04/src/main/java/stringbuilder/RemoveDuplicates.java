package stringbuilder;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!charSet.contains(ch)){
                sb.append(ch);
                charSet.add(ch);
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "sudhakarsingh";
        System.out.println("String : "+str);
        String processedString  = removeDuplicates(str);
        System.out.println(processedString);

    }
}

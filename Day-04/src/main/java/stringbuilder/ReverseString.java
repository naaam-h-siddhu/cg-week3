package stringbuilder;

public class ReverseString {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("String : "+str);
        String reversedStr = reverse(str);
        System.out.println("Reversed String:"+reversedStr);


    }
}

package stringbufferbuilder;

public class ConcatenationUsingStringBuffer {
    public static String concatenate(String[] stringArray){
        StringBuffer sb = new StringBuffer();
        for(String string : stringArray){
            sb.append(string);
            sb.append(" ");

        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

        String[] stringArray = {"hi", "my", "name", "is", "siddhu"};

        String concatenatedString = concatenate(stringArray);
        System.out.println("Concatenated String : "+concatenatedString);
    }
}

package linearsearch;

public class SearchWord {

    public static String searchSequenceWithWord(String[] strings, String target){
        for (int i = 0; i < strings.length; i++) {

            String string = strings[i];
            if(string.contains(target)){
                return string;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] strings = {"The quick brown fox jumps",
                "Over the lazy dog sleeps now",
                "siddhu loves coding in Python",
                "Data science is always evolving",
                "Machine learning models require training"};

        String target = "siddhu";
        System.out.println(searchSequenceWithWord(strings,target));



    }
}

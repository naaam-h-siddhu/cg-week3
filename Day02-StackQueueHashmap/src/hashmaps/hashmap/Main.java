package hashmaps.hashmap;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap(10);
        map.put(1,10);
        map.put(2,20);
        map.put(11,110);
        System.out.println("Value of key 1: "+map.get(1));
        System.out.println("Value of key 2: "+map.get(2));
        System.out.println("Value of key 11: "+map.get(11));
        map.remove(1);
        System.out.println("value of 1 after removing : "+map
                .get(1));
    }
}

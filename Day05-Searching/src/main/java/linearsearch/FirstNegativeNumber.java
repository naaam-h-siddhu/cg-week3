package linearsearch;

public class FirstNegativeNumber {
    public static int linearSearchFirstNegative(int[] number){
        for (int i = 0; i < number.length; i++) {
            if(number[i] < 0)
                return i;

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {4,1,4,1,-1,42,-5};
        int firstNegativeIndex = linearSearchFirstNegative(numbers);
        if(firstNegativeIndex == -1){
            System.out.println("No negative integer exists ");
        }
        else {
            System.out.println("First negative integer is at index "+firstNegativeIndex);
        }
    }
}

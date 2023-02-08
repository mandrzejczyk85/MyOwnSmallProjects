package UsefulThings;

public class SortTabMinToMax {
    public static void main(String[] args) {
        int[] numbers = {2,6,4,8,12,10,16,14,18,20};
        int num;
        for(int i = 0; i < numbers.length; i++) {
            num = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j] < num) {
                    num = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = num;
                }
            }
        }
        for (int number : numbers ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

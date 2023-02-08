package UsefulThings;

import java.util.Arrays;

public class LoopMix {
    public static void main(String[] args) {
        sortTab();
        changeIndexTab();
        changeIndex();
        System.out.println();
        stars();
    }
    public static void sortTab() {
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
    public static void changeIndexTab() {
        int[] digits = {1,2,3,4,5,6,7,8,9,10};
        digits[0] += digits[8];
        digits[9] -= digits[8];
        System.out.println(Arrays.toString(digits));
    }
    public static void changeIndex() {
        int temp;
        int[] digits = {2,4,6,8,10};
        temp = digits[0];
        digits[0] = digits[4];
        digits[4] = temp;
        System.out.println(Arrays.toString(digits));
    }
    public static void stars() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

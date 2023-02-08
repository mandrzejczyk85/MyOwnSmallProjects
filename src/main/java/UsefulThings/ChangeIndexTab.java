package UsefulThings;

import java.util.Arrays;

public class ChangeIndexTab {
    public static void main(String[] args) {
        changeIndex();
        changeIndexTab();
    }
    public static void changeIndexTab() {

        int[] digits = {1,2,3,4,5,6,7,8,9,10};
        digits[0] += digits[8];
        digits[9] -= digits[8];
        System.out.println(Arrays.toString(digits));
    }
    //-----------------------------------------------------------------
    public static void changeIndex() {
        int temp;
        int[] digits = {2,4,6,8,10};
        temp = digits[0];
        digits[0] = digits[4];
        digits[4] = temp;
        System.out.println(Arrays.toString(digits));
    }
}

package ArrayClass;

import java.util.Arrays;

public class ArrayFill {
    static void main(String[] args) {
        int []arr = new int[5];
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,100); // it used fill the value in Array
        System.out.println(Arrays.toString(arr));
    }
}

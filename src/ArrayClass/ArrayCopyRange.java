package ArrayClass;

import java.util.Arrays;

public class ArrayCopyRange {
    static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};

        int[]orr = Arrays.copyOfRange(arr,3,7);
        System.out.println(Arrays.toString(orr));
    }
}

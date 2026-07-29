package ArrayClass;

import java.util.Arrays;

public class Array_Equals {
    static void main(String[] args) {
        int [] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        int []c = {2,3,4,5};

        System.out.println(Arrays.equals(a,b)); // it will check the same element in same order
        System.out.println(Arrays.equals(b,c));
    }
}

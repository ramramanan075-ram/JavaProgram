package ArrayClass;

import java.util.Arrays;

public class BinarySearch {
    static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};

        int index = Arrays.binarySearch(a,5);
        int ran= Arrays.binarySearch(a,1212);
        System.out.println(index);
        System.out.println(ran);
    }
}

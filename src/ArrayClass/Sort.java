package ArrayClass;
import java.util.*;
public class Sort {
    static void main(String[] args) {
        // sort is used to print values in ascending order.....

        int[]a = {45,23,67,1,43,89,3};
        Arrays.sort(a);

        // toSting is used to convert the array in readable manner
        // without ToString it print address.
        System.out.println(Arrays.toString(a));
    }

}

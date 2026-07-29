package ArrayClass;
import java.util.Arrays;
public class ToString {
    static void main(String[] args) {
            int[]a = {45,23,67,1,43,89,3};
            Arrays.sort(a);

            // toSting is used to convert the array in readable manner
            // without ToString it print address.
            System.out.println(Arrays.toString(a));
        }

    }


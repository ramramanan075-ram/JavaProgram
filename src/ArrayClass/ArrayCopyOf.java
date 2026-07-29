package ArrayClass;
import java.util.Arrays;
public class ArrayCopyOf {
    static void main(String[] args) {
        int []a ={1,2,3,4};
        int []b = Arrays.copyOf(a,4);
        System.out.println(Arrays.toString(b));
    }
}

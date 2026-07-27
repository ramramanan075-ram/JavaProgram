package Arrays;
class ArrayMethod{

    static void display( int []arr){
        // it's used to get the array values for main method.

        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}

public class Passing_arr_method {
    static void main(String[] args) {
        int []number = {1,2,3,4,5,6};
        ArrayMethod.display(number); // its is used to pass the array value in method....
    }
}

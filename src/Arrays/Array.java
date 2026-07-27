package Arrays;

public class Array {
    static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        System.out.println(arr[1]);

        //**************************//
        int []orr =new int[6];

        arr[0]=1;
        arr[1]=0;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        System.out.println(orr[1]);

        // update value in arr//
        arr[5]=100;
        //**********************************//
        // Traversing arr //
        for (int i = 0;i<6;i++){
            System.out.println(arr[i]);
        }
        System.out.println("length"+arr.length);


    }
}

package TwoDArray;

import java.util.Scanner;

public class JaggedArray {
    /* Jagged array is nothing but no of rows cannot be same in no column...
    * it's also a 2d array
     */
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] arr = {{1,2},{3,4,5}};

        for (int i =0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //************UserInput***********//

        int [][]orr = new int[2][];
        orr[0]= new int[2];
        orr[1]=new int[3];

        for (int i =0;i< orr.length;i++){
            for (int j =0;j<orr[i].length;j++){
                System.out.println(" enter the values:"+i+","+j);
                orr[i][j]= sc.nextInt();
            }
        } for (int i =0;i< orr.length;i++){
            for (int j =0;j<orr[i].length;j++){
                System.out.print(orr[i][j]+" ");
            }
            System.out.println();
        }


    }


}

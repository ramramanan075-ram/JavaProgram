package TwoDArray;

import java.util.Scanner;

public class MatrixOf2x2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {{1,2,3},{4,5,6}};
//        System.out.print(arr[0][0]);
//        System.out.print(arr[0][1]);
//        System.out.print(arr[0][2]);
//        System.out.println(arr[1][0]);
//        System.out.print(arr[1][1]);
//        System.out.print(arr[1][2]);

        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //*******************/Userinput/**********//
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]num=new int[n][m];
        for (int k =0;k< num.length;k++){
            for (int j=0;j<num[k].length;j++){
                num [k][j] = sc.nextInt();

            } } for (int k =0;k<num.length;k++){
                for (int j=0;j<num[k].length;j++){
                    System.out.print(num[k][j]+" ");
        }System.out.println();

    }
}}

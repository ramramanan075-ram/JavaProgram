package ControlStatement;

import java.util.concurrent.locks.Condition;

public class Break_As_Form_Goto {
 public static void main(String[] args) {

     Condition:
     for (int i =1;i<=3;i++){
         for (int j =1;j<=3;j++){
             if (i==2&&j==2){
                 break Condition;
               //  break ;
             }
             System.out.println(i+" "+j);
         }
     }
    }
}

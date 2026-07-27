package ControlStatement;

public class Break {
    static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            if (i==3){
                break; // while the condition is true it break entire loop
            }
            System.out.println(i);
        }
    }
}

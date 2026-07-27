package ControlStatement;

public class Return {

    public static int display(int a,int b){
        return a+b;
    }


    static void main(String[] args) {
        int res = display(2,4);
        System.out.println(res);

        //**********2***********//
        System.err.println("start");
        return;
     //   System.out.println("ram"); error coming because return statement stop the entire method
    }
}

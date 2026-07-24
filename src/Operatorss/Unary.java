package Operatorss;

public class Unary {
    static void main(String[] args) {
        // unary have two types increment and decrement
        // increment and decrement have two types pre and post increments.
        int a = 5;

        a++;
        System.out.println(a);  // post increment
        a--;
        System.out.println(a); // post increment ( a value and then ++ increment or decrement)

        int b = 10;
        System.out.println(++b); // pre increment
        System.out.println(--b);  // pre increment ( ++ increment or decrement and then a value)


    }
}

package ConditionalStatement;

public class Nested_IF {
    static void main(String[] args) {
        int a = 10;
        if (a == 10){
            if (a==a){
                System.out.println(a);
            }
        }else {
            System.out.println(" not equal");
        }
    }
}

package ConditionalStatement;

public class SwitchCase {
    static void main(String[] args) {
        int a = 20;

        switch (a){
            case 2:
                System.out.println(" its 2 not valid");
                break;
            case 3:
                System.out.println(" its 3 not valid");
                break;
            case 20:
                System.out.println(" its valid:"+a);
                break;
            default:
                System.out.println(" enter the no ");
        }
    }
}

public class DataTypes {
    static void main(String[] args) {
        // primitive Data types //
        byte a = 100;    // 1 bytes
        short b = 2000;  // 2 bytes
        int c = 400000;  // 4 bytes
        long d = 10000000;  // 8 bytes
        float e = 10.0f;    // 4 bytes
        double f = 1.0000000d; // 8 bytes
        char g = 'a';            // 2 bytes
        boolean h = true;         // 1 bit

        //***********************************//
        // non-primitive Data types //

        String str = " ramana"; // String class in java
        int [] arr = {1,2,3,4,5,6}; // Array
        Integer wrapperInt = Integer.valueOf(30);
        StringBuffer sb = new StringBuffer("java");

        //*********************************//
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
        System.out.println("String:"+str);
        for (int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("StringBuffer:"+sb);



    }
}

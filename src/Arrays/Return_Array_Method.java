package Arrays;
class ArrayReturn{

    static int[]arr(){

        int [] arrr ={1,2,3,4,5};
        arrr[3]=22;
        return arrr;
    }
}


public class Return_Array_Method {
    static void main(String[] args) {

        int [] number = ArrayReturn.arr();

        for (int num:number){
            System.out.println(num);
        }
    }
}

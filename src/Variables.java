public static class Variables {

    int a = 10; // instance variable  its scope in class
    static int b = 20; // static variable class level shared all the object of the class
    int c = a + b;

    void display() {
        int d = 20; // local variables its scope it method
        System.out.println(d);
    }


}
  public static void main(String[] args) {
//        Variables v = new Variables();
//      System.out.println(v.c);
//
//      v.display();
      System.out.println(Variables.b);

  }


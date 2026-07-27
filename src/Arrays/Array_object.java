package Arrays;
 class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;

    }
    void display(){
        System.out.println(name+" "+age);
    }
}

public class Array_object {
    static void main(String[] args) {
        Student [] students = new Student[3];
        students[0]= new Student("Ramanan",21);
        students[1]= new Student("ram",23);
        students[2]= new Student("raman",19);

        for (Student student : students)
        {
            student.display();
        }


    }
}

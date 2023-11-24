package main.java.PrototypePattern.solution;


public class Main {
    public static void main(String args[]){

        Student obj=new Student(10,2,"rocky");

        //creating clone of obj
        Student cloneObj= (Student) obj.clone();
        System.out.println(cloneObj);

    }
}

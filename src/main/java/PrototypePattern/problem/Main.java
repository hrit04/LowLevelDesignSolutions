package main.java.PrototypePattern.problem;

public class Main {
    public static void main(String args[]){

        Student obj=new Student(10,2,"rocky");

        //creating clone of obj
        //existing cloning procedure
        Student cloneObj=new Student();
        cloneObj.name= obj.name;
        cloneObj.age= obj.age;
       // cloneObj.rollNumber=obj.rollNumber; //problem : private member are not accessable from outside the class
                                            // too much cloning
    }
}

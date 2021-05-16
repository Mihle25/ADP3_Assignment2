package za.ac.cput.ADP3_Assignment3;

/*
Emihle Menzo 218337035
Assignment2
ADP3

 */

import java.util.ArrayList;
import java.util.List;


public class ListClass {


    List StudentNames = new ArrayList();


    public void add(String object){
        System.out.println("===Add student name: ====");
        StudentNames.add(object);
        System.out.println(StudentNames);

    }


    public void remove(String object){
        System.out.println(" ===Remove student name: ===  ");
        StudentNames.remove(object);
        System.out.println("===Removing object: ===");
        System.out.println(StudentNames);
    }

    public String find(String object){
        System.out.println(" ===Search student name:=== ");
        if(StudentNames.contains(object)){
            System.out.println("===Searching===");
            System.out.println(object);
        }else{
            System.out.println("Can't find object");
        }
        return object;
    }

}

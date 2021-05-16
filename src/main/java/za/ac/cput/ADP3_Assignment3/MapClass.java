package za.ac.cput.ADP3_Assignment3;

/*
Emihle Menzo 218337035
Assignment2
ADP3

 */

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    HashMap <Integer, String> studentNames = new HashMap <Integer, String>();

    public void add(int index,String value){
        System.out.println(" Add student name here ");
        studentNames.put(index,value);
        System.out.println(studentNames);

    }

    public void remove(int key){
        System.out.println("Remove student name here ");
        String returned_value = (String)studentNames.remove(key);
        System.out.println("Removing object.....");
        System.out.println(studentNames);

    }
    public String find(String value){
        System.out.println("Search student name here ");

        System.out.println("Searching");
        if(studentNames.containsValue(value)){
            System.out.println(value);
        }else{
            System.out.println("Can't find object ");
        }
        return value;
    }
}

package za.ac.cput.ADP3_Assignment3;

/*
Emihle Menzo 218337035
Assignment2
ADP3

 */

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    Set <String> Names = new HashSet<String>();

    public void add(String name){
        System.out.println(" Add names ");
        Names.add(name);
        System.out.println(Names);
    }

    public void remove(String object){
        System.out.println("Remove names ");
        Names.remove(object);
        System.out.println(Names);
    }

    public String find(String object){
        System.out.println("Search names");
        if(Names.contains(object)){
            System.out.println("Searching");
            System.out.println(object);
        }else{
            System.out.println("Can't find object");
        }
        return object;
    }

}
package za.ac.cput.ADP3_Assignment3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionClass {

    Collection <String> snames = new ArrayList<>();

    public void add(String object){
        System.out.println("============= Add Here -> ==============");
        snames.add(object);
        System.out.println(snames);

    }

    public void remove(String object){
        System.out.println("============= Remove Here -> ==============");
        snames.remove(object);
        System.out.println("Removing object.....");
        System.out.println(snames);
    }

    public String find(String object){
        System.out.println("============= Search Here -> ==============");
        if(snames.contains(object)){
            System.out.println("Searching.....");
            System.out.println(object);
        }else{
            System.out.println("Cant find");
        }
        return object;
    }

}


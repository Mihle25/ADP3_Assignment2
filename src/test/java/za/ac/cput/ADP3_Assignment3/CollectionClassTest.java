package za.ac.cput.ADP3_Assignment3;

/*
Emihle Menzo 218337035
Assignment2
ADP3

 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionClassTest {

    private CollectionClass CollectionC;

    @BeforeEach
    void setUp() {
        CollectionC = new CollectionClass();

    }

    @Test
    void add() {
            CollectionC.add("Mihle");
            CollectionC.add("Emihle");

            assertNotNull(CollectionC);
            System.out.println(CollectionC);
        }


    @Test
    void remove() {
        CollectionC.add("Mihle");
        CollectionC.add("Emihle");
        CollectionC.remove("Emihle");
        if(CollectionC == null){
            System.out.println("The list is empty");
            assertNull(CollectionC);
        }else
            assertNotNull(CollectionC);
    }

    @Test
    void find() {
        CollectionC.add("Mihle");
        CollectionC.add("Emihle");
        CollectionC.find("Emihle");
        System.out.println(CollectionC);
        assertNotNull(CollectionC);
    }
}
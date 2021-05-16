package za.ac.cput.ADP3_Assignment3;

/*
Emihle Menzo 218337035
Assignment2
ADP3

 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListClassTest {

    private ListClass ListC;

    @BeforeEach
    void setUp() {
        ListC = new ListClass();
    }

    @Test
    void add() {
        ListC.add("Mihle");
        ListC.add("Likhanye");
        assertNotNull(ListC);
    }

    @Test
    void remove() {
        ListC.add("Mihle");
        ListC.add("Likhanye");
        ListC.remove("Likhanye");
        if(ListC == null){
            System.out.println("The list is empty");
            assertNull(ListC);
        }else
            assertNotNull(ListC);
    }

    @Test
    void find() {
        ListC.add("Mihle");
        ListC.add("Likhanye");
        ListC.find("Likhanye");
        System.out.println(ListC);
        assertNotNull(ListC);
    }
}
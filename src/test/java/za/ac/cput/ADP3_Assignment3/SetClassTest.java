package za.ac.cput.ADP3_Assignment3;

/*
Emihle Menzo 218337035
Assignment2
ADP3

 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetClassTest {
    private SetClass SetC;

    @BeforeEach
    void setUp() {
        SetC = new SetClass();
    }

    @Test
    void add() {
        SetC.add("Emihle");
        SetC.add("Phila");
        assertNotNull(SetC);
        System.out.println(SetC);
    }

    @Test
    void remove() {

        SetC.add("Emihle");
        SetC.add("Phila");
        SetC.remove("Phila");
        assertNotNull(SetC);
        System.out.println(SetC);

    }

    @Test
    void find() {
        SetC.add("Emihle");
        SetC.add("Phila");
        SetC.find("Phila");
        assertNotNull(SetC);
        System.out.println(SetC);
    }
}
package za.ac.cput.ADP3_Assignment3;

/*
Emihle Menzo 218337035
Assignment2
ADP3

 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MapClassTest {
    private MapClass MapC;

    @BeforeEach
    void setUp() {
        MapC = new MapClass();
    }

    @Test
    void add() {
        MapC.add(0,"Emihle");
        MapC.add(1,"Amahle");
        MapC.add(2,"Mihle");
        assertNotNull(MapC);
    }

    @Test
    void remove() {
        MapC.add(0,"Emihle");
        MapC.add(1,"Amahle");
        MapC.add(2,"Mihle");

        MapC.remove(2);
        assertNotNull(MapC);
    }

    @Test
    void find() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);
        MapC.add(0,"Emihle");
        MapC.add(1,"Amahle");
        MapC.find("Amahle");

        System.out.println(MapC);
        assertNotNull(MapC);

    }
}
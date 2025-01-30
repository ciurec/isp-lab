package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import src.lab3.exec4.MyPoint;

import static org.junit.Assert.*;

public class MyPointTest {

    @Test
    public void testGetDistance() {

        MyPoint pointOne = new MyPoint(5, 6, 7);
        MyPoint pointTwo = new MyPoint(4, 5, 3);
        Assertions.assertEquals(2.327761429538331, pointOne.getDistance(pointTwo));

    }
}

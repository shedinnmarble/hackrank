package com.ctci.dynamicProgrammingTest;

import com.ctci.dynamicProgramming.RobotInAGrid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Dewei on 12/6/2016.
 */
public class RobotInAGridTest {
    private RobotInAGrid robotInAGrid = new RobotInAGrid();
    private boolean maze[][] = new boolean[][]{
            {true, true, true, true, true},
            {true, true, true, true, true},
            {true, true, false, true, true},
            {true, true, false, true, true},
            {true, true, true, false, true}};

    @Test
    public void testMaze() {
        ArrayList<Point> result = robotInAGrid.getPath(maze);
        if (result == null) {
            System.out.println("no result");
            return;
        }
        for (Point p :
                result) {
            System.out.println(p.toString());
        }
        //Assertions.assertEquals(null, );
    }
}

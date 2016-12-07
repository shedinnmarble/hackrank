package com.ctci.dynamicProgramming;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Dewei on 12/6/2016.
 * Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
 * The robot can only move in two directions, right and down, but certain cells are "off limits" such that
 * the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
 * the bottom right.
 */
public class RobotInAGrid {

    public ArrayList<Point> getPath(boolean[][] maze) {
        if (maze == null || maze.length == 0) return null;
        ArrayList<Point> path = new ArrayList<>();
        HashSet<Point> failedPoints = new HashSet<>();
        if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
            return path;
        }
        return null;

    }

    private boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
        if (col < 0 || row < 0 || !maze[row][col]) {
            return false;
        }
        Point p = new Point(row, col);
        if (failedPoints.contains(p)) {
            return false;
        }
        boolean isOrigin = row == 0 && col == 0;
        if (isOrigin || getPath(maze, row, col - 1, path, failedPoints) || getPath(maze, row - 1, col, path, failedPoints)) {

            path.add(p);
            return true;
        }
        failedPoints.add(p);
        return false;
    }
}

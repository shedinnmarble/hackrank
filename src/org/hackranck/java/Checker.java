package org.hackranck.java;

import java.util.Comparator;

/**
 * Created by Dewei on 11/25/2016.
 * this is a comparator class
 * https://www.hackerrank.com/challenges/java-comparator
 */
public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        //score desc,name asc
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        if (b.score > a.score) {
            return 1;
        }
        if(b.score<a.score){
            return -1;
        }
        return 0;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


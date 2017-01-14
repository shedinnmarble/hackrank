package com.ctci.dynamicProgrammingTest;

import com.ctci.dynamicProgramming.SubSet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dewei on 12/7/2016.
 */
public class SubSetTest {
    private SubSet subSet = new SubSet();

    @Test
    public void test() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        ArrayList<ArrayList<Integer>> result = subSet.getSubsets(arrayList, 0);
        for (ArrayList<Integer> set :
                result) {
            System.out.print("{");
            for (int value :
                    set
                    ) {
                System.out.print(value + ",");
            }
            System.out.println("}");
        }
    }
}

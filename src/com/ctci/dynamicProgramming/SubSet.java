package com.ctci.dynamicProgramming;

import java.util.ArrayList;

/**
 * Created by Dewei on 12/7/2016.
 */
public class SubSet {
    public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set,int index) {
        ArrayList<ArrayList<Integer>> allSubSets;
        if(set.size()==index){
            allSubSets =new ArrayList<ArrayList<Integer>>();
            allSubSets.add(new ArrayList<Integer>());
        }else{
            allSubSets = getSubsets(set,index+1);
            int item=set.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets=new ArrayList<>();
            for(ArrayList<Integer> subset:allSubSets){
                ArrayList<Integer> newsubset=new ArrayList<>();
                newsubset.addAll(subset);
                newsubset.add(item);
                moreSubsets.add(newsubset);
            }
            allSubSets.addAll(moreSubsets);
        }
        return allSubSets;
    }
}

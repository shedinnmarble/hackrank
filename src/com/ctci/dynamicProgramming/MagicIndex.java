package com.ctci.dynamicProgramming;

/**
 * Created by Dewei on 12/7/2016.
 * Magic Index: A magic index in an array A [ 0 ••• n -1] is defined to be an index such that A[ i] =
 * i. Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in
 * array A.
 */
public class MagicIndex {
    /**
     * @param arr
     * @return
     */
    public boolean isExistsMagicIndex(int[] arr) {
        //arr[1,1,3,5,19,29]
        //arr[0,1,2,3]
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr[i]) {
//                return true;
//            }
//        }
        int index=0;
        while (index<arr.length){
            if(index==arr[index]){
                return true;
            }
            index=arr[index];
        }
        return false;
    }
    public int isExistsmagicIndexBinarySearch(int[] arr,int start, int end){
        if(end<start){
            return -1;
        }
        int mid=(start+end)/2;
        if(mid==arr[mid]){
            return mid;
        }
        else if(arr[mid]>mid){
          return   isExistsmagicIndexBinarySearch(arr,mid+1,end);
        }else{
           return isExistsmagicIndexBinarySearch(arr,0,mid-1);
        }
    }
}

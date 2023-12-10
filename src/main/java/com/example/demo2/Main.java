package com.example.demo2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("hellow");


        Integer [] nums = new Integer[5];
        nums[0]=10;
        nums[1]=11;
        nums[2]=12;
        nums[3]=13;
        nums[4]=14;

        for(Integer elem: nums){
            System.out.println(elem);
        }
        ArrayList<Integer> nimofids = new ArrayList<>();//frquent read and som write and also save memory becouse every time i press add it add new bar arry
        nimofids.add(16);
        nimofids.add(17);
        nimofids.add(18);
        nimofids.add(19);

        for(Integer elem: nimofids){
            System.out.println(elem);
        }


        LinkedList<Integer> nimofidss = new LinkedList<>();//frquent Write and som read
        nimofidss.add(20);
        nimofidss.add(21);
        nimofidss.add(22);
        nimofidss.add(23);

        for(Integer elem: nimofidss){
            System.out.println(elem);
        }

        //##################################################################//

        int[] inputArray = {4, 3, 1, 1, 3, 5, 5, 8, 8, 8, 9};

        ArrayList<Integer> compressedList = filterArray(inputArray);

        System.out.println("Compressed List: " + compressedList);

    }

    public  static ArrayList<Integer> filterArray (int[] inputarray)
    {
        ArrayList<Integer> array1 = new ArrayList<>();

        ArrayList<Integer> array2 = new ArrayList<>();

        for(int nums :inputarray)
        {
            if(array1.contains(nums)){
                array2.add(nums);
            }else {
                array1.add(nums);
            }
        }

return array2;
    }
}
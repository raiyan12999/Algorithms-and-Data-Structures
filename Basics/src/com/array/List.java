package com.array;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        // why arraylists can't be of primitive type
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);
//        System.out.println(nums[2]);

        System.out.println(nums.get(2));
    }
}

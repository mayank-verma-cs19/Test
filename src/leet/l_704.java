package leet;
/*
* 704. Binary Search
Easy
Topics
Companies
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
* If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


Constraints:
*
* */

public class l_704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(findVariable(nums,target));
    }

     public static int findVariable(int[] arr , int x){
          int size = arr.length;
          int mid = 0;
          if (size%2 == 0){
              mid = size/2 ;
          }else {
              mid = size+1/2;
          }
         return -1;
    }

    public static int rec(int[] arr , int x ,int y , int m){
        if (arr[])
    }
}

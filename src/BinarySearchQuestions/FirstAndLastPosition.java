package BinarySearchQuestions;

// leetcode #34
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] arr,int target){
        int[] array = {-1,-1};

        int start = search(arr,target,true);
        int end = search(arr,target,false);

        array[0] = start;
        array[1] = end;
        return array;
    }
    public static int search(int arr[], int target,boolean checkStartIndex){
        int ans = -1;
        
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                ans = mid;
                if(checkStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    
}

package BinarySearchQuestions;

// leetcode #852
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class LargestElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {24,69,70,71,72,99,79,78,67,36,26,19};
        System.out.println(search(arr));
    }
    public static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part of array
                end = mid;
            }else if(arr[mid]<arr[mid+1]){
                //you are in inc part
                start = mid+1;
            }
        }
        return start;
    }
}

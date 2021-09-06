package BinarySearchQuestions;

// leetcode #33
// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target){
        int pivot = findPivot(arr);
        if(target>=arr[0]){
            return search(arr,target,0,pivot);
        }
        return search(arr,target,pivot+1,arr.length-1);
    }

    public static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(start == end){
                return mid;
            }
            if(arr[mid]>arr[mid+1]){
                return mid;
            }if(arr[mid]<arr[start]){
                end = mid-1;
            }if(arr[mid]>=arr[start]){
                start = mid+1;
            }
        }
        return -1;
    }

}

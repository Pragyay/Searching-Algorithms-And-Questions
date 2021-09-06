package BinarySearchQuestions;

// find target value in mountain array

public class BinarySearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;

        int peak = peakValueInMountainArray(arr);

        int firstTry = binarySearch(arr,target,0,peak);

        if(firstTry != -1){
            System.out.println(firstTry);
        }else{
            int secondTry = binarySearch(arr,target,peak+1,arr.length-1);
            System.out.println(secondTry);
        }

    }
    public static int peakValueInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //dec part of array
                end = mid;
            }else if(arr[mid]<arr[mid+1]){
                //inc part of array
                start = mid+1;
            }
        }return start;
    }

    public static int binarySearch(int[] arr,int target,int start,int end){

        boolean isIncreasing = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(isIncreasing) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }else{
                if(arr[mid]>target){
                    start = mid+1;
                }if(arr[mid]<target){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}

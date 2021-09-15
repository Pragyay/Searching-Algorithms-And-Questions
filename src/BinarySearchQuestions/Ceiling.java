package BinarySearchQuestions;

//find ceiling of number in sorted array

public class Ceiling {
    public static void main(String[] args) {
        int arr[]={5,7,7,7,7,7,8,8,10};
        int target = 8;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int arr[],int target) {
        //if target bigger than biggest element in array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
package BinarySearchQuestions;

//find floor of a number in sorted array

public class Floor {
    public static void main(String[] args) {
        int arr[] = {1,22,33,44,55,56,77,88};
        int target = 69;
        System.out.println(floor(arr,target));
    }
    static int floor(int arr[],int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
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
        return end;
    }

}

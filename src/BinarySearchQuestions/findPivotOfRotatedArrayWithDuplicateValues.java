package BinarySearchQuestions;

//pivot in rotated sorted array with duplicate values

public class findPivotOfRotatedArrayWithDuplicateValues {
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
                start++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,3,3,4,4,2,2,2,2,2};
        System.out.println(findPivot(arr));
    }
}

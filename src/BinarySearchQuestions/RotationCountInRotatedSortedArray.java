package BinarySearchQuestions;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCountInRotatedSortedArray {
    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if(arr[start]<arr[end]){
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(start == end){
                return mid;
            }
            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr =  {7, 9, 11, 12, 15};;
        System.out.println(findMin(arr));
    }
}

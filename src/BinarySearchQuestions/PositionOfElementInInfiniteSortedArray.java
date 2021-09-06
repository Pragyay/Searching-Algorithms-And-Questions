package BinarySearchQuestions;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class PositionOfElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = 11;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end + 1;
            end = start*2+1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

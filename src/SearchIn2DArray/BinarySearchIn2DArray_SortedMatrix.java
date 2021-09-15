package SearchIn2DArray;

import java.util.Arrays;

public class BinarySearchIn2DArray_SortedMatrix {

    public static int[] search(int[][] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid_row = (start+end)/2;
            if(arr[mid_row][0]<=target && target<=arr[mid_row][arr.length-1]){
                //do binary search in this row
                return binarySearch(arr,target,mid_row);
            }else if(target<arr[mid_row][arr.length-1]){
                end = mid_row-1;
            }else if(target>arr[mid_row][arr.length-1]){
                start = mid_row+1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] binarySearch(int[][] arr,int target,int mid_row){
        int s = 0;
        int e = arr.length-1;
        while (s <= e) {
            int mid = (s+e)/2;
            if(target>arr[mid_row][mid]){
                s = mid+1;
            }else if(target<arr[mid_row][mid]){
                e = mid-1;
            }else{
                return new int[]{mid_row,mid};
            }
        }return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 1;
        System.out.println(Arrays.toString(search(arr,target)));
    }
}

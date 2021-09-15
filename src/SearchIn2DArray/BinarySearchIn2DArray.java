package SearchIn2DArray;

// rows and cols of matrix both sorted

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static int[] search(int[][] arr,int target) {
        int rows = 0;
        int cols = arr[rows].length - 1;
        while(cols>=0 && rows<arr.length) {
            if (target < arr[rows][cols]) {
                cols--;
            } else if (target > arr[rows][cols]) {
                rows++;
            } else {
                return new int[]{rows, cols};
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
        int target = 16;
        System.out.println(Arrays.toString(search(arr,target)));
    }
}

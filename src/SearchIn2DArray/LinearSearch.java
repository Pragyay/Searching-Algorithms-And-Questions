package SearchIn2DArray;

import java.util.Arrays;

public class LinearSearch {
    public static int[] search(int[][] arr,int target){

        for(int rows=0;rows<arr.length;rows++){
            for(int cols=0;cols<arr[rows].length;cols++){
                if(arr[rows][cols] == target){
                    return new int[]{rows,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {3,5,6},
                {9,2,8},
                {1,7,4}
                };
        System.out.println(Arrays.toString(search(arr,7)));

    }
}

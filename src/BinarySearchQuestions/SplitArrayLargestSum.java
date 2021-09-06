package BinarySearchQuestions;

// leetcode 410
// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int m) {
        int s = findMax(nums);
        int e = sumOf(nums);
        int mid = 0;
        while(s<e){
            mid = s+(e-s)/2;
            int pieces = calcPieces(nums,mid);
            if(pieces<=m){
                e = mid;
            }else{
                s = mid+1;
            }
        }return s;
    }

    static int calcPieces(int[] arr,int mid){
        int sum = 0;
        int pieces = 1;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum>mid){
                pieces +=1;
                sum = 0;
                i--;
            }
        }
        return pieces;
    }

    static int findMax(int[] arr){
        int ans = arr[0];
        for(int num:arr){
            if(num>ans){
                ans = num;
            }
        }
        return ans;
    }

    static int sumOf(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr,m));
    }
}

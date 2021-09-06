package BinarySearchQuestions;

// https://www.geeksforgeeks.org/find-index-first-1-infinite-sorted-array-0s-1s/

public class First1InAnInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 1};
        int target = 1;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(arr[end]!=1){
            start = end+1;
            end = start*2+1;
        }

        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }if(target>arr[mid]){
                start = mid+1;
            }else{
                ans = mid; //potential answer
                end = mid-1;
            }
        }
        return ans;
    }

}

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {9,5,3,2,1,-3};
        System.out.println(binarySearch(arr,3));
    }
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isIncreasing = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(isIncreasing) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }else{
               if(arr[mid]>target){
                   start = mid+1;
               }if(arr[mid]<target){
                   end = mid-1;
               }else{
                   return mid;
                }
            }
        }
        return -1;
    }
}

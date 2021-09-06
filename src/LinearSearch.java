public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,2,56,23,87,11,55,69};
        int target = 69;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

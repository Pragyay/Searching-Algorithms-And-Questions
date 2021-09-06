package BinarySearchQuestions;

// leetcode 744
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'd';
        System.out.println(smallestLetter(letters,target));

    }
    static char smallestLetter(char[] letters,char target) {

        int start = 0;
        int end = letters.length - 1;
        if(target>=letters[end]) {
            return letters[0];
        }else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (letters[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letters[start];
        }
    }
}

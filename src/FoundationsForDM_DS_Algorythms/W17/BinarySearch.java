package FoundationsForDM_DS_Algorythms.W17;

public class BinarySearch {
    //Finding any index of X in a sorted (ascending) array of numbers (textbook application):
    public static int indexOfX(int [] nums, int x){
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == x){
               return mid;
            }else if(nums[mid] > x){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
    public static int leftMostIndexOfX(int [] nums, int x){
        int left = 0;
        int right = nums.length-1;
        int answer = -1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == x){
                answer = mid;
                right = mid-1;
            } else if (nums[mid]>x) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return answer;
    }
    public static int rightMostIndexOfX(int [] nums, int x){
        int left = 0;
        int right = nums.length-1;
        int answer = -1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == x){
                answer = mid;
                left = mid+1;
            } else if (nums[mid]>x) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,4,5};
        System.out.println(indexOfX(nums, 3)); //3
        System.out.println(leftMostIndexOfX(nums, 3)); //2
        System.out.println(rightMostIndexOfX(nums, 3)); //5
    }
}

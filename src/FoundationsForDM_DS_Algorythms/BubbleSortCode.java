package FoundationsForDM_DS_Algorythms;

public class BubbleSortCode {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = {6, 5, 2, 8, 9, 4};
        int temp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int n : nums) {
            System.out.print(n);

        }
    }
}

package LeetCode;

public class P_26_RemoveDuplicatesFromSortedArrayAltern {
    /*
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements
 in the order they were present in nums initially.
 The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
     */


public static int countOfUniqueEl (int [] nums){

    // [ 1, 1, 1, 3, 4, 4, 5]

    int j = 1;
    for(int i = 1; i<nums.length; i++){
        if(nums[i]==nums[i-1]){
            continue;
        }
        nums[j++]=nums[i];//we are saying first assign the value to nums[j] then increment j by one
        // it is the same as
        // nums[j] = nums[i];
        // j++
    }
    return j;
}



    public static void main (String[]args){
        int [] nums = {1, 1, 1, 2, 2, 3};

        System.out.println("Sorted array with unique: " + countOfUniqueEl(nums));

    }

}




/*

                public static int removeDuplicates(int[] nums) {
                    if (nums.length == 0) return 0;

                    int uniqueIndex = 1;

                    for (int i = 1; i < nums.length; i++) {
                        if (nums[i] != nums[i - 1]) {
                            nums[uniqueIndex] = nums[i];
                            uniqueIndex++;
                        }
                    }

                    return uniqueIndex;
                }

                public static void main(String[] args) {
                    // Test case 1
                    int[] nums1 = {1, 1, 1, 1, 2};
                    int k1 = removeDuplicates(nums1);
                    printResult(nums1, k1);

                }
                // Helper method to print results
                public static void printResult(int[] nums, int k) {
                    System.out.println("k = " + k);
                    System.out.print("Array after removing duplicates: ");
                    for (int i = 0; i < k; i++) {
                        System.out.print(nums[i] + " ");
                    }
                    System.out.println("\n");
                }
            }
*/
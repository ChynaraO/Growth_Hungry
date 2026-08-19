package FoundationsForDM_DS_Algorythms;

public class SelectionSortCode {
    public static void main(String[] args) {

    System.out.println("Hello, World!");
    int [] nums = {6,5,2,8,9,4};
    int ind = -1;
    int length = nums.length;

    System.out.println("Before sorting");
    for(int n : nums){
        System.out.print(n);
    }

    for (int i = 0; i<length-1; i++){
        ind = i;
        for(int j = i+1; j<length; j++){
            if(nums[ind]> nums[j]){
                ind = j;
            }
        }
        int temp = nums[ind];
        nums[ind] = nums[i];
        nums[i] = temp;
    }

System.out.println("after sorting");
    for(int n : nums){
        System.out.print(n);
    }
}
}

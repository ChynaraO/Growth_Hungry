import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        int [] nums = {2,0,2,1,1,0};
        sort(nums);
    }

    public static void sort(int []nums) {
        int indexTwo = nums.length - 1;
        int indexZero = 0;

        int i = 0;
        while (indexZero < indexTwo) {

            if (nums[i] == 0) {
                swap(indexZero++, i, nums);
            } else if (nums[i] == 2) {
                swap(i, indexTwo--, nums);
            } else if (nums[i] == 1) {
                i++;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int index1, int index2, int[] nums) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
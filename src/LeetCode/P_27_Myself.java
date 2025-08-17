package LeetCode;

public class P_27_Myself {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int i = 0;

        while(i < nums.length){
            if(nums[i] != val){
                nums[index++] = nums[i];
            }
            i++;
        }
        return index;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 0};
        System.out.println(removeElement(nums, 2));
        String s = "ChynaraAltynaiAltynai";
        /// ////////0      7      14
        System.out.println("first index: " + strStr(s, "Altynai"));;
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack.contains(needle)) {
            index =  haystack.indexOf(needle);
            index = haystack.indexOf(needle, index + needle.length());
        }
        return index;
    }
}

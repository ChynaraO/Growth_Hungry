package LeetCode;

public class P_69 {
    public static int sqrNum (int num){
        if(num == 1 || num==0) return num;
        int left = 0;
        int right = num;
        int answer = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((long) mid * (long)mid > num){
                right = mid-1;
            }else{
                answer = mid;
                left = mid+1;
            }
        }
return answer;
    }

    public static void main(String[] args) {
        System.out.println(sqrNum(8));//2
    }
}

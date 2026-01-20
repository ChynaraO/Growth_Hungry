package LeetCode.Easy;

public class P_1011 {
    public static int shipwithinDays(int[] weights, int D){
        int left = 0; //min
        int right = 0; //max
        int answer = -1;
        for(int w: weights){
            left = Math.max(left, w);
            right += w;
        }
        while (left<=right){
            int middle = left + (right-left)/2;
            int need = 1;
            int cur = 0;
            for(int w: weights){
                if(cur + w>middle){
                    need+=1;
                    cur = w;
                } else {
                    cur += w;
                }
            }
            if(need>D){
                left = middle+1;
            } else{
                answer = middle;
                right = middle-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //weights = [1,2,3,4,5,6,7,8,9,10], days = 5
        int []weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipwithinDays(weights, 5));//15
    }
}

package LeetCode;

public class P_278_FirstBadVersion {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            int answer = 0;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(isBadVersion(mid)){
                    right = mid-1;
                    answer = mid;
                } else {
                    left = mid+1;
                }
            }
            return answer;
        }
        boolean isBadVersion(int mid){
         if(mid==4){
             return false;
         }
            return true;
        }
}

package DiscrMath;

public class W18 {
    public static int gcd(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd (b, a%b);
    }

    public static void twopinters(int [] nums, int target){
        int s = 0;
        for(int i = 0; i<nums.length; i++){
            s+=nums[i];
            if(s > target){

                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println( gcd(36, 12));
    }
}

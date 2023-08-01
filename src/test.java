public class test {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        int ans = nums.length+1, j = 0, sum = 0;

        for(int i=0; i < nums.length; i++) {
            sum += nums[i];

            if(sum>=target){
                while(sum>=target) {
                    sum-=nums[j];
                    j++;
                }
                ans = Math.min (ans, i-j+2);
            }

        }

        if (ans == nums.length + 1)
            ans = 0;

        System.out.println(ans);
    }
}
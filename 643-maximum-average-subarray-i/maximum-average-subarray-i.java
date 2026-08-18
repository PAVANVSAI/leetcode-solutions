class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double a=0;
        double m=Double.NEGATIVE_INFINITY;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            
            if(i>=k) {
                sum-=nums[i-k];
            }
            if(i>=k-1) {
                a=(double)sum/k;
                m=Math.max(m,a);
            }
        }
        return m;
    }
}
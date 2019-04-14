package algorithm.solution;


/**
 * 求所有字数组和的最大值
 */

public class MaxSum {

    //子数组最大和
    public void test(){
        int[] num = {1,-2,3,10,-4,7,2,-5};
        System.out.println(maxSum(num));
    }

    public int maxSum(int[] num){
        int curSum = 0;
        int curMaxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for(int i = 0;i < num.length; i ++){
            if(curSum <= 0){
                curSum = num[i];
                start = i;
            }
            else{
                curSum += num[i];
            }
            if(curSum > curMaxSum){
                curMaxSum = curSum;
                end = i;
            }
        }
        for(int i = start; i <= end; i ++){
            System.out.println(num[i]);
        }
        return curMaxSum;
    }
}

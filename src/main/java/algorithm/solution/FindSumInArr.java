package algorithm.solution;

//给出一个排序好的数组和一个数，求数组中连续元素的和等于所给数的子数组
public class FindSumInArr {

    public void findSum(int[] num,int sum) {
        int left;
        int right;
        for (int i = 0; i < num.length; i++) {
            int curSum = 0;
            left = i;
            right = i;
            while (curSum < sum) {
                curSum += num[right++];
            }
            if (curSum == sum) {
                for (int j = left; j < right; j++) {
                    System.out.print(num[j] + " ");
                }
                System.out.println();
            }
        }
    }
}

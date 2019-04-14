package algorithm.solution;

import org.junit.Before;
import org.junit.Test;

public class FindSumInArrTest {

    private FindSumInArr findSum;

    @Before
    public void init() {
        findSum = new FindSumInArr();
    }

    @Test
    public void test(){
        int[] num = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 7;
        findSum.findSum(num,sum);
    }

}

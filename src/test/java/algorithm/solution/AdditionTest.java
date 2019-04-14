package algorithm.solution;

import common.bean.ListNode;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AdditionTest {

    private ListNode num1;
    private ListNode num2;

    private Addition addition;

    @Before
    public void prepare() {
        addition = new Addition();
        ListNode numTmp1 = new ListNode(1);
        ListNode numTmp2 = new ListNode(2);
        ListNode numTmp3 = new ListNode(3);

        ListNode numTmp4 = new ListNode(4);
        ListNode numTmp5 = new ListNode(7);
        ListNode numTmp6 = new ListNode(8);

        numTmp1.next = numTmp2;
        numTmp2.next = numTmp3;
        numTmp4.next = numTmp5;
        numTmp5.next = numTmp6;

        num1 = numTmp1;
        num2 = numTmp4;
    }

    /**
     *  测试相同长度的数字
     *  TODO 待测 ：进位与否
     */
    @Test
    public void testSameDigits() {
        ListNode listNode = addition.addTwoNumbers(num1, num2); //123 + 478 = 601
        assertEquals(listNode.val, 6);
        assertEquals(listNode.next.val, 0);
        assertEquals(listNode.next.next.val, 1);
    }

}

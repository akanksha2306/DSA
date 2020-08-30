package interviewCake.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class cafe_order_checker {
    //https://www.interviewcake.com/question/java/cafe-order-checker?course=fc1&section=array-and-string-manipulation

    public boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {

        int takeOutOrdersIndex = 0;
        int dineInOrdersIndex = 0;
        int servedOrderIndex = 0;

        int serveOrdeLen = servedOrders.length;
        int takeoutOrderLen = takeOutOrders.length;
        int dineInorderLen = dineInOrders.length;

        for (int order : servedOrders) {
            if (takeOutOrdersIndex < takeoutOrderLen && order == takeOutOrders[takeOutOrdersIndex]) {
                takeOutOrdersIndex++;
                servedOrderIndex++;


                return true;
            }
            if (dineInOrdersIndex < dineInorderLen && order == dineInOrders[dineInOrdersIndex]) {
                dineInOrdersIndex++;
                servedOrderIndex++;
                return true;
            } else {
                return false;
            }

        }
        return true;


    }


    @Test
    public void oneRegisterHasUnservedOrders() {
        final int[] takeOutOrders = {55, 9};
        final int[] dineInOrders = {7, 8};
        final int[] servedOrders = {1, 7, 8, 9};
        cafe_order_checker cafe_order_checker = new cafe_order_checker();
        final boolean result = cafe_order_checker.isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders);
        System.out.println(result);
    }
}
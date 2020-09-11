//package DataStructures.Stack.nearestGreaterToLeft;
//
//import DataStructures.Stack.nearestGreaterToRight.Ngr;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//
//@RunWith(Parameterized.class)
//public class NglTest {
//
//    @Parameterized.Parameters(name = "{index}: Test with X={0}, Y={1}, result: {2}")
//    public static Iterable<Object[]> data() {
//        return Arrays.asList(new Object[][]{
//                {new int[]{11, 13, 21, 3}, new int[]{13, 21, -1, -1}},
//                {new int[]{12, 5, 4, 3}, new int[]{-1, -1, -1, -1}},
//                {new int[]{0, 2, 21, 39}, new int[]{2, 21, 39, -1}},
//                {new int[]{0, 2, 3, 5}, new int[]{2, 3, 5, -1}},
//                {new int[]{5, 4, 3, 2}, new int[]{-1, -1, -1, -1}},
//        });
//    }
//
//    public NglTest(int[] inputArray, int[] expectedArray) {
//        this.inputArray = inputArray;
//        this.expectedArray = expectedArray;
//    }
//    @Test
//    public void nextGreaterRight() {
//
//        int[] actualArray = new Ngr().nextGreaterRight(inputArray, inputArray.length).stream().mapToInt(i->i).toArray();
//        Assert.assertArrayEquals(expectedArray, actualArray);
//
//    }
//
//
//}
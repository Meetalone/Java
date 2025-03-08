package ori.ArrayList.demo2;

/*
1. 打印数组
2.计算数组的平均值
 */
public class ArrayUtils {
    private ArrayUtils() {}

    public static double arrayAverage(int[] arr) {
        if (arr.length != 0) {
            double result = 0;
            for (int elem : arr) {
                result += elem;
            }
            return result/arr.length;
        } else {
            throw new ArithmeticException("/ by zero.");
        }

    }

    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int elem : arr) {
            sb.append(elem);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

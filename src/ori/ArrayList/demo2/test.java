package ori.ArrayList.demo2;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        ArrayUtils.printArray(arr);
        System.out.println("the average of the array is : " + ArrayUtils.arrayAverage(arr));

        int[] arr1 = {};
        ArrayUtils.arrayAverage(arr1);


    }

}

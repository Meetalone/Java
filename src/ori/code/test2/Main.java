package ori.code.test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Commodity [] a = new Commodity[3];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Commodity();
        }

        for (Commodity commodity : a) {
            //commodity = new Commodity();      增强for循环不能修改数组的值，因为commodity得到的是a的副本，也就是null
            System.out.println("Please input id, name, price, inventory:");
            commodity.setId(sc.nextInt());
            commodity.setName(sc.next());
            commodity.setPrice(sc.nextInt());
            commodity.setInventory(sc.nextInt());
            System.out.println("next one.");
        }

        for (Commodity commodity : a) {
            System.out.println(commodity.toString());
        }
    }
}

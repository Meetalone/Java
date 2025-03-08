package ori.ArrayList.demo1;

import java.util.ArrayList;

public class ALdemo1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();

        list.add("hi");
        list.add("hello");
        System.out.println(list);
        System.out.println("the first element is : " + list.get(0));
        list.set(1, "music");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}

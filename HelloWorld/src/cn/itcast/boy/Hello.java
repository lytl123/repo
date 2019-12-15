package cn.itcast.boy;

import java.util.ArrayList;

//单行注释
public class Hello {

    public static void main(String[] args) {

        System.out.println("hello world");
        System.out.println("args = [" + args + "]");
        String[] arrs = new String[]{"A", "B", "C", "D"};
        for (int i = 0; i < arrs.length; i++) {
            System.out.println("arr[i] = " + arrs[i]);
        }
        for (String s : arrs) {
            System.out.println("s = " + s);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        if (arrayList != null) {

        }
        if (arrayList == null) {


        }
        for (int i = 0; i < arrayList.size(); i++) {

        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {

        }

    }
}

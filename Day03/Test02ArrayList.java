package Day03;

import java.util.ArrayList;

/**
 * @Author qzyit@qq.com
 * @date 2019-11-12 下午 17:04
 */
public class Test02ArrayList {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());

    }
}

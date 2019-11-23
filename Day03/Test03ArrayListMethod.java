package Day03;

import java.util.ArrayList;

/**
 * @Author qzyit@qq.com
 * @date 2019-11-23 下午 14:43
 */
public class Test03ArrayListMethod {

    public static void main(String[] args){

        //first method
        //second method

        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("小明");
        list1.add("小赵");
        list1.add("小花");

        System.out.println("get:"+list1.get(0));
        System.out.println("get:"+list1.get(1));

        System.out.println("get:"+list1.get(2));

        System.out.println(list1);
        System.out.println("size:"+list1.size());

        System.out.println("remove"+list1.remove(0));

        for (int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }






    }
}

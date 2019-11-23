package Day03;

import java.util.ArrayList;

/**
 * @Author qzyit@qq.com
 * @date 2019-11-12 下午 16:25
 */
public class Test01ArrayList {
    public static  void main(String[] args){
        //crate student array
        ArrayList<String> arrayList= new ArrayList();

        //create student object
        String  s1= "小孩";
        String  s2="小熊";
        String  S3="没办法";

        //print student arraylist collections
        System.out.println(arrayList);

        //let student object as element add to collections

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(S3);
        System.out.println(arrayList);

    }
}

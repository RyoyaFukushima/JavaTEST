
package func;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import bean.FooBean;
import bean.HogeBean;

public class CollectionTask {

    public void test(){
        ArrayList<String> list1 = new ArrayList<>();
        // list1に要素を追加する
        list1.add("apple");
        list1.add("mango");
        list1.add("banana");
        
        ArrayList<String> list2 = new ArrayList<>();
        // list2に要素を追加する
        list2.add("beef");
        list2.add("chiken");
        list2.add("pork");
        
        Map<Integer, String> resultMap = new HashMap<>();
        
        // list1の要素をマップに追加する
        for (int i = 0; i < list1.size(); i++) {
            resultMap.put(i, list1.get(i));
        }
        
        // list2の要素をマップに追加する
        int offset = list1.size(); // 既存の要素数をオフセットとして使用する
        for (int i = 0; i < list2.size(); i++) {
            resultMap.put(i + offset, list2.get(i));
        }

        System.out.println(resultMap);
        

        ArrayList<FooBean> foolist = new ArrayList<>();
        
        for(int i = 0; i < resultMap.size(); i++){
            FooBean f = new FooBean();
            if(i >= 0 && i <= 2){
                System.out.println("firstList:"+resultMap.get(i));
                f.setValue1(resultMap.get(i));
            }else if(i >= 3 && i <= 5){
                System.out.println("SecondList:"+resultMap.get(i));
                f.setValue2(resultMap.get(i));
            }

            foolist.add(f);
        }

        for(FooBean fv : foolist){
            System.out.println("TESTvalues, "  + fv.getValue1() + ", " + fv.getValue2());
        }
    }

    public void test1() {
        ArrayList<String> list1 = new ArrayList<>();
        // list1に要素を追加する
        list1.add("apple");
        list1.add("mango");
        list1.add("banana");
        
        ArrayList<String> list2 = new ArrayList<>();
        // list2に要素を追加する
        list2.add("beef");
        list2.add("chiken");
        list2.add("pork");
        
        Map<Integer, String> resultMap = new HashMap<>();
        
        // list1の要素をマップに追加する
        for (int i = 0; i < list1.size(); i++) {
            resultMap.put(i, list1.get(i));
        }
        
        // list2の要素をマップに追加する
        int offset = list1.size(); // 既存の要素数をオフセットとして使用する
        for (int i = 0; i < list2.size(); i++) {
            resultMap.put(i + offset, list2.get(i));
        }
    
        System.out.println(resultMap);
    
        ArrayList<FooBean> foolist = new ArrayList<>();
        
        for (int i = 0; i < resultMap.size(); i++) {
            FooBean f = new FooBean();
            if (i >= 0 && i <= 2) {
                System.out.println("firstList:" + resultMap.get(i));
                f.setValue1(resultMap.get(i));
                foolist.add(f);
            } else if (i >= 3 && i <= 5) {
                System.out.println("SecondList:" + resultMap.get(i));
                f.setValue2(resultMap.get(i));
                foolist.add(f);
            }
    
            
        }
    
        for (FooBean fv : foolist) {
            System.out.println("TESTvalues, " + fv.getValue1() + ", " + fv.getValue2());
        }
    }
    

    public ArrayList<HogeBean> getHogeInfo(String instanceName) {

        ArrayList<String> fooList = new ArrayList<>();
        fooList.add("apple");
        fooList.add("mango");
        fooList.add("banana");

        ArrayList<String> hogeList = new ArrayList<>();
        hogeList.add("bronze");
        hogeList.add("sliver");
       // hogeList.add("platinum");


        ArrayList<HogeBean> result = new ArrayList<>();

        HogeBean bean = new HogeBean();
        bean.setInstanceName(instanceName);
        bean.setValueList1(hogeList);
        bean.setValueList2(fooList);

        result.add(bean);

        for (HogeBean h : result) {
            String instancename = h.getInstanceName();
            ArrayList<String> valueList1 = h.getValueList1();
            ArrayList<String> valueList2 = h.getValueList2();
    
            for (int i = 0; i < valueList1.size(); i++) {
                String value1 = valueList1.get(i);
                String value2 = valueList2.get(i);
                System.out.println("インスタンス名: " + instancename + " 値1:" + value1 + " 値2:" + value2);
            }
        }
    
        return result;
    }
}


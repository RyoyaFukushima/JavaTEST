package func;

import java.util.ArrayList;
import bean.FooBean;


public class TestBeanListFactory {
    
    public ArrayList<bean.FooBean> fooBeanList(){

        ArrayList<FooBean> list = new ArrayList<>();
        FooBean fb1 = new FooBean();
        fb1.setValue1("hogeValue1");
        fb1.setValue2("hogeValue2");

        list.add(fb1);
        
        FooBean fb2 = new FooBean();
        fb2.setValue1("fooValue1");
        fb2.setValue2("fooValue2");
        list.add(fb2);

        FooBean fb3 = new FooBean();
        fb3.setValue1("piyoValue1");
        fb3.setValue2("piyoValue2");
        
        list.add(fb3);

        return list;
    }
}

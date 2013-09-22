package collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("applicationContext.xml");

      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

      /**comment out below line of code to get data of list defined in xml*/
      List lst = new ArrayList();
      lst.add("one");
      lst.add("two");
      lst.add("three");
      lst.add("four");
      lst.add("five");
      lst.add("six");
      lst.add("seven");
      lst.add("eight");
      jc.setAddressList(lst);
      /***********************/
      jc.getAddressList();
      jc.getAddressSet();
      jc.getAddressMap();
      jc.getAddressProp();
   }
}

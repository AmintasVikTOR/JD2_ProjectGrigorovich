package by.amintas.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.apache.commons.lang3.ClassPathUtils;

public class TestSpring {
  public static void main(String[] args) {
    //
      ApplicationContext context=new ClassPathXmlApplicationContext  ("application-content.xml");

      IAvto avto=context.getBean("changeAvto", IAvto.class);
      System.out.println(avto.getAvto());
  }
}

package testSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.Person;

public class test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config/bean.xml");//��ȡbean.xml�е�����
        Person p = (Person) ctx.getBean("person",Person.class);//����bean�����ö���
        p.info();
        p.setAge(20);
        p.info();
    }
}
package testSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.Person;

public class test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config/bean.xml");//读取bean.xml中的内容
        Person p = (Person) ctx.getBean("person",Person.class);//创建bean的引用对象
        p.info();
        p.setAge(20);
        p.info();
    }
}
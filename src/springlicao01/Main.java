package springlicao01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Message message1 = (Message)ctx.getBean("message1");
        System.out.println(message1.getMessage());
    }
}

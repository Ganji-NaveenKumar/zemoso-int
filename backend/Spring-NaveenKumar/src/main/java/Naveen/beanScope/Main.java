package Naveen.beanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static  void main(String[]args){
        AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(Appconfig.class);
        HelloWorld hw=config.getBean("helloWorld",HelloWorld.class);
        hw.sayHello();
    }
}

package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
//        //根据配置文件xml获取容器及其中的bean组件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        //根据bean组件名字获取bean对象（bean名称为xml中id的属性值）
//		Person bean = (Person) applicationContext.getBean("person");
//		System.out.println(bean);
//		System.out.println(bean.getName());
//		System.out.println(bean.getAge());

		//根据注解方式获取容器及其中的bean组件
        //输入的是配置类，根据配置获取容器及组件
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //根据类型获取bean
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
        //获取bean名称根据bean的类型，传入参数为bean的返回值类型
        //通常获取的bean名称为方法名称，也可以在配置文件中自定义@Bean("person")
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }

    }
}

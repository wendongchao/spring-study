package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.controller.BookController;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类，相当于一个xml配置文件
//扫描包下面的bean组件，并且按照注解排除Controller，Service的注解
//@ComponentScan(value = "com.atguigu",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//})
//扫描包下面的bean组件,并且只包含Controller的注解
//@ComponentScans(value = {})//在value数组中多次指定规则
@ComponentScans(value = {
        @ComponentScan(value = "com.atguigu", includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),
                @ComponentScan.Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
        }, useDefaultFilters = false)
})
//@ComponentScan(value="com.atguigu")//该注解放在配置类上，指定要要扫描的包路径
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件，当使用时需要配置禁用默认过滤规则useDefaultFilters = false
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；只要是BookService类型的组件都会加载到容器中，不管是子类或者实现类
//FilterType.ASPECTJ：使用ASPECTJ表达式,不常用
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

    //给容器中注册一个Bean组件;类型为返回值的类型，id默认是用方法名作为id，可以指定：@Bean("person")
    @Bean("person01")
    public Person person(){
      return  new Person("zhangsan",15);
    }
}

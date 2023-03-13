package com.removingconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: annotation is used for make java file into the config.xml files
 * @ComponentScan: annotation is used for taking package of java class
 * @Bean: annotation is use for creating bean of any class, function name becomes name of the Bean
 * Note: at the time of using @Bean annotation, you don't need to use @ComponentScan Annotation
 */
@Configuration
//@ComponentScan(basePackages = "com.removingconfig")
public class JavaConfigBean {

    @Bean
    public Sam getSam(){
        System.out.println("inside the Sam Bean");
        Sam sam=new Sam();
        return sam;
    }
    //creating Bean of Student class by using Annotation way
    @Bean(name={"student","children"})
    public Student getStudent(){
        System.out.println("inside the Student Bean");
        Student student=new Student(getSam());
        return student;
    }
}

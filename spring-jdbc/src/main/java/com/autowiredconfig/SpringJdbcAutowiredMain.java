package com.autowiredconfig;

import com.autowiredconfig.studentDao.StudentDaoImpl;
import com.jdbc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SpringJdbcAutowiredMain {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDaoImpl studentDao=context.getBean("studentDaoImpl",StudentDaoImpl.class);

        //selecting all student records
        List<Student> students=studentDao.getAllStudent();
        students.stream().forEach(e->{
            System.out.println(e.getId()+" "+e.getName()+ " "+e.getCity() );
        });

    }
}

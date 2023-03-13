package com.annotationjdbc;

import com.jdbc.Student;
import com.autowiredconfig.studentDao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SpringJdbcAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDaoImpl studentDao=context.getBean("studentDao",StudentDaoImpl.class);
        List<Student> students=studentDao.getAllStudent();
        students.stream().forEach(e->{
            System.out.println(e.getId()+" "+e.getName()+ " "+e.getCity() );
        });
    }
}

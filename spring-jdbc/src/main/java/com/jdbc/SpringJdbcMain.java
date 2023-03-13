package com.jdbc;

import com.autowiredconfig.studentDao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SpringJdbcMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
       JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate", JdbcTemplate.class);
       /*
       //insert query
        String query="insert into student(id,name,city) value(?,?,?)";
        //fire query
        int update = jdbcTemplate.update(query, 99, "new_name", "new_city");
        System.out.println("inserted result : "+update);

        */

        StudentDaoImpl studentDao=context.getBean("studentDao",StudentDaoImpl.class);
//        Student student=new Student(23,"NEW_CIRY","NEW_CIRY");
//        studentDao.insert(student);

        //update query checking
//        Student student=new Student(99,"qaaa","aaaa");
//        System.out.println("changed result "+studentDao.change(student,99));

        //deleting object of student
//        System.out.println("deleting result : "+studentDao.delete(23));

        //selecting single student object
//        Student student = studentDao.getStudent(93);
//        System.out.println(student.getCity()+" "+student.getName()+" "+student.getId());

        //selecting all student records
        List<Student> students=studentDao.getAllStudent();
        students.stream().forEach(e->{
            System.out.println(e.getId()+" "+e.getName()+ " "+e.getCity() );
        });

    }
}

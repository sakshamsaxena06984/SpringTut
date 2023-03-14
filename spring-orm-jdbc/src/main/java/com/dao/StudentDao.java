package com.dao;

import com.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;
    public StudentDao(){}

    @Transactional
    public int insert(Student student){
        int ans= (int) this.hibernateTemplate.save(student);
        return 1;
    }

    //getting single object data
    public Student getStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        return student;
    }

    //get all object
    public List<Student> getAllStudent(){
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }

    //delete the records
    @Transactional
    public void deleteStudent(int id){
        Student student=this.hibernateTemplate.get(Student.class,id);
        this.hibernateTemplate.delete(student);
    }

    //update the student object
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }


    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

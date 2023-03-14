package com.jdbc.studentDao;

import com.jdbc.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int change(Student student,int id);
    public int delete(int id);
    public Student getStudent(int id);
    public List<Student> getAllStudent();
}

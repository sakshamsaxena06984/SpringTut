package com.jdbc.studentDao;

import com.jdbc.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    public JdbcTemplate jdbcTemplate;

    public StudentDaoImpl() {

    }

    @Override
    public int insert(Student student) {
        String query="insert into student(id,name,city) value(?,?,?)";
        int update = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return update;
    }

    @Override
    public int change(Student student, int id) {

        String query="update student set name=? ,city=? where id=?";
        int update = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return update;
    }

    @Override
    public int delete(int id) {
        String query="delete from student where id=?";
        int update = this.jdbcTemplate.update(query, id);
        return update;
    }

    @Override
    public Student getStudent(int id) {
        //selecting query
        String query="select * from student where id=?";
        RowMapper<Student> rowMapper=new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, id);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        String query="select * from student";
        List<Student> ans = this.jdbcTemplate.query(query, new RowMapperImpl());
        return ans;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
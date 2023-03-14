package com.annotationjdbc;

import com.autowiredconfig.studentDao.StudentDao;
import com.autowiredconfig.studentDao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    //DataSource
    @Bean(name="ds")
    public DataSource getDriverManagerDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("saks123ham@MYSQL");
        return ds;
    }
    //JdbcTemplate
    @Bean(name="jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDriverManagerDataSource());
        return jdbcTemplate;

    }

    @Bean(name="studentDao")
    public StudentDao getStudentDao(){
       StudentDaoImpl studentDao=new StudentDaoImpl();
       studentDao.setJdbcTemplate(getJdbcTemplate());
       return studentDao;
    }
}

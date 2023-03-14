package com.stereotypeannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("stu")
@Scope("prototype")
public class Student {
    @Value("Saksham Saxena")
    private String name;
    @Value("Uttarakhand")
    private String city;
    @Value("#{phone}")
    private List<String> phones;

    public Student(){}
    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phones=" + phones +
                '}';
    }
}

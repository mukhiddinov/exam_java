package org.example;

public class Student {
    String fullname;
    Integer age;

    public Student() {
    }

    public Student(String fullname, Integer age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.example.one_to_one_student_and_address;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {
    @PrimaryKey
     int id;

    @ColumnInfo
    String name;

    @ColumnInfo
    String classs;

    @ColumnInfo
    int age;

    public Student(int id, String name, String classs, int age) {
        this.id = id;
        this.name = name;
        this.classs = classs;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                ", age=" + age +
                '}';
    }
}

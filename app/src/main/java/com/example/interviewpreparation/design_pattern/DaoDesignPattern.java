package com.example.interviewpreparation.design_pattern;

import java.util.List;

class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

interface TeacherDao {
    List<Teacher> getAllTeachers();

    void delete(int pos);

    void insert(Teacher teacher);

    void update(Teacher teacher);
}

class TeacherDaoImpl implements TeacherDao {

    @Override
    public List<Teacher> getAllTeachers() {
        System.out.println("getAllTeachers");
        return null;
    }

    @Override
    public void delete(int pos) {
        System.out.println("delete");
    }

    @Override
    public void insert(Teacher teacher) {
        System.out.println("insert");
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("update");
    }
}

public class DaoDesignPattern {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDaoImpl();
        teacherDao.getAllTeachers();
        teacherDao.delete(0);
        teacherDao.insert(null);
        teacherDao.update(null);
    }
}

package com.yankee;

import scala.Int;

/**
 * @Description 学生类对象
 * @Date 2022/3/22 13:26
 * @Author yankee
 */
public class Student {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 类的静态属性
     */
    private static String school = "清华";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + "  " + this.age + "  " + Student.school);
    }

    public static void main(String[] args) {
        Student student = new Student("alice", 20);
        student.printInfo();
    }
}

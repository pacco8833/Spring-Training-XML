package net.genspark.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {

        ApplicationContext appCTX = new FileSystemXmlApplicationContext("src\\main\\resources\\app.xml");
        Student student = (Student) appCTX.getBean("student");
        System.out.println(student);
    }
}

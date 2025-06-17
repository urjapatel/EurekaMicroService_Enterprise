package com.sample.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student create() {

        Student s1 = new Student();
        // Using static data for example purposes only.. should be avoided..
        s1.setStudentId(101);
        s1.setFirstName("Alice");
        s1.setLastName("Smith");
        s1.setPhone("123-456-7890");
        s1.setDob("2000-05-20");
        s1.setStreetAddress("123 Main St");
        s1.setCityAddress("Toronto");
        s1.setNoAddress("Apt 4B");

        return s1;
    }
}

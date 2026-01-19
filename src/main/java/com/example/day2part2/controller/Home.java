package com.example.day2part2.controller;

import com.example.day2part2.models.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.*;

@RestController
public class Home {
    @GetMapping("/")
    public List<StudentModel> getStudent() {
        List<StudentModel> students = new ArrayList<>();

        students.add(new StudentModel(1, "Akrati", "akrati@gmail.com"));
        students.add(new StudentModel(2, "Rahul", "rahul@gmail.com"));
        students.add(new StudentModel(3, "Neha", "neha@gmail.com"));
        students.add(new StudentModel(4, "Aman", "aman@gmail.com"));
        students.add(new StudentModel(5, "Priya", "priya@gmail.com"));

        return students;
    }


}

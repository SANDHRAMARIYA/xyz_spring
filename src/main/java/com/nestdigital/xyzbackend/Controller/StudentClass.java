package com.nestdigital.xyzbackend.Controller;

import com.nestdigital.xyzbackend.Dao.StudentDao;
import com.nestdigital.xyzbackend.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentClass {

    @Autowired
    private StudentDao dao;


    @CrossOrigin(origins ="*")
    @PostMapping(path = "/studentEntry",consumes = "application/json",produces = "application/json")
        public String studentEntry(@RequestBody StudentModel student){
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<StudentModel>view(){
        return (List<StudentModel>)dao.findAll();
    }

}

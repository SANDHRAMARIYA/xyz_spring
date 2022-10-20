package com.nestdigital.xyzbackend.Controller;


import com.nestdigital.xyzbackend.Dao.FacultyDao;
import com.nestdigital.xyzbackend.Model.FacultyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {

@Autowired
private FacultyDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addfaculty",consumes = "application/json",produces = "application/json")
    public String addfaculty(@RequestBody FacultyModel faculty){
        System.out.println(faculty.toString());
        dao.save(faculty);
        return "{status:'success}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewfaculty")
    public List<FacultyModel> viewfaculty() {
        return (List<FacultyModel>)  dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deletefaculty",consumes = "application/json",produces = "application/json")
    public String deletefaculty(@RequestBody FacultyModel faculty){
dao.deletefacultyById(faculty.getId());
return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchfaculty",consumes = "application/json",produces = "application/json")
    public List<FacultyModel> searchfaculty(@RequestBody FacultyModel faculty){
        return (List<FacultyModel>) dao.searchfaculty(faculty.getName());
    }
}
